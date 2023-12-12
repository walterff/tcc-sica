package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblvacinas;

public class VacinasDAO {
    private Session sessão;
    
    public VacinasDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarVacina(Tblvacinas tblvacinas){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblvacinas);
        ts.commit();
    }
    
    public void deletarVacina(Tblvacinas tblvacinas){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblvacinas);
        ts.commit();
    }
    
    public void alterarVacina(Tblvacinas tblvacinas){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblvacinas);
        ts.commit();
    }
    
    public Tblvacinas procurarVacina(int idVacina){
        return (Tblvacinas) sessão.load(Tblvacinas.class, idVacina);
    }
    
    public List<Tblvacinas> listarVacinas(){
        List<Tblvacinas> vacinas = (List<Tblvacinas>) sessão.createQuery("from Tblvacinas").list();
        return vacinas;
    }
    
    public List<Tblvacinas> listarVacinasCod(int codigo){
        List<Tblvacinas> vacinas = (List<Tblvacinas>) sessão.createQuery("from Tblvacinas").list();
        return vacinas;
    }
    
    public int ultimoVacina(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codVacina) from Tblvacinas").uniqueResult();
        return x;
    }
    
    public int primeiroVacina(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codVacina) from Tblvacinas").uniqueResult();
        return x;
    }
    
    public boolean existeVacina(int codigo){
        Query query = sessão.createQuery("from Tblvacinas where codVacina = :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
        return false;
        }
    }
    
    public List<Tblvacinas> listaVacinas(String filtro){
        Query query = sessão.createQuery("from Tblvacinas WHERE nomeVacina = :filtro");
        query.setString("filtro", filtro);
        List<Tblvacinas> vacinas = (List<Tblvacinas>) query.list();
        return vacinas;
    }
    
    public List<Tblvacinas> listaNomeVacinas(String texto){
    int numero = 0;
    try{
        numero = Integer.valueOf(texto);
    } catch(NumberFormatException e){
    }
    texto = "%"+texto+"%";
    Query query = sessão.createQuery("from Tblvacinas where codVacina = :cod or nomeVacina like :nome");
    query.setInteger("cod", numero);
    query.setString("nome", texto);
    List<Tblvacinas> vacinas = (List<Tblvacinas>) query.list();
    return vacinas;
    }
}
