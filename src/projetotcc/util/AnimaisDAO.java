package projetotcc.util;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblanimais;

public class AnimaisDAO {
    private Session sessão;
    
    public AnimaisDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarAnimal(Tblanimais tblanimais){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblanimais);
        ts.commit();
    }
    
    public void deletarAnimal(Tblanimais tblanimais){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblanimais);
        ts.commit();
    }
    
    public void alterarAnimal(Tblanimais tblanimais){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblanimais);
        ts.commit();
    }
    
    public Tblanimais procurarAnimal(int idAnimal){
        return (Tblanimais) sessão.load(Tblanimais.class, idAnimal);
    }
    
    public List<Tblanimais> listarAnimais(){
        List<Tblanimais> animais = (List<Tblanimais>) sessão.createQuery("from Tblanimais ORDER BY nomeAni ASC").list();
        return animais;
    }
    
    public int ultimoAnimal(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codAni) from Tblanimais").uniqueResult();
        return x;
    }
    
    public int primeiroAnimal(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codAni) from Tblanimais").uniqueResult();
        return x;
    }
    
    public boolean existeAnimal(int codigo){
        Query query = sessão.createQuery("from Tblanimais where codAni = :cod or codAni like :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
        return false;
        }
    }
    
    public List<Tblanimais> listaNomeAnimais(String nome){
        nome = "%"+nome+"%";
        Query query = sessão.createQuery("from Tblanimais WHERE nomeAni = :nome or nomeAni like :nome");
        query.setString("nome", nome);
        List<Tblanimais> animais = (List<Tblanimais>) query.list();
        return animais;
    }
    
    public List<Tblanimais> listaIdadeAnimais(String filtro){
        Query query = sessão.createQuery("from Tblanimais WHERE idadeAni <= :filtro");
        query.setString("filtro", filtro);
        List<Tblanimais> animais = (List<Tblanimais>) query.list();
        return animais;
    }
    
    public List<Tblanimais> listaTipoAnimais(String filtro){
        Query query = sessão.createQuery("from Tblanimais WHERE tipoAni = :filtro");
        query.setString("filtro", filtro);
        List<Tblanimais> animais = (List<Tblanimais>) query.list();
        return animais;
    }
    
    public List<Tblanimais> listaAnimais(String texto){
    int numero = 0;
    try{
        numero = Integer.valueOf(texto);
    } catch(NumberFormatException e){
    }
    texto = "%"+texto+"%";
    Query query = sessão.createQuery("from Tblanimais where codAni = :cod or nomeAni like :nome");
    query.setInteger("cod", numero);
    query.setString("nome", texto);
    List<Tblanimais> animais = (List<Tblanimais>) query.list();
    return animais;
    }
   
    
    public void relatorioAnimais(){
    String path = "\\src\\relatorios\\relatorioAnimais.jasper";
    File file = new File(path);
    
    String arquivo = System.getProperty("user.dir")+file;
    System.out.println("Valor ARQUIVO: " + arquivo);
    
    try{
        Connection conexao = new FabricaConexao().getConexao();
     
        JasperPrint jp = JasperFillManager.fillReport(arquivo, new HashMap(), conexao);
           System.out.println("E so add todas as bibliotecas XP");
        JasperViewer viewer = new JasperViewer(jp, false);
        viewer.setVisible(true);
    }catch(JRException e){
        System.out.println("E so add todas as bibliotecas XP");
                 System.out.println("Local erro: "+e.getLocalizedMessage());
        System.out.println("Erro:   " +e.getMessage());
    }
}
    
}