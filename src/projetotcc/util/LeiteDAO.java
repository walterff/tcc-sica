package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblleite;

public class LeiteDAO {
    private Session sessão;
    
    public LeiteDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarLeite(Tblleite tblleite){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblleite);
        ts.commit();
    }
    
    public void deletarLeite(Tblleite tblleite){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblleite);
        ts.commit();
    }
    
    public void alterarLeite(Tblleite tblleite){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblleite);
        ts.commit();
    }
    
    public Tblleite procurarLeite(int idLeite){
        return (Tblleite) sessão.load(Tblleite.class, idLeite);
    }
    
    public List<Tblleite> listarLeite(){
        List<Tblleite> leites = (List<Tblleite>) sessão.createQuery("from Tblleite").list();
        return leites;
    }
    
    public int ultimoLeite(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codLeite) from Tblleite").uniqueResult();
        return x;
    }
    
    public int primeiroLeite(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codLeite) from Tblleite").uniqueResult();
        return x;
    }
    
    public boolean existeLeite(int codigo){
        Query query = sessão.createQuery("from Tblleite where codLeite = :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
        return false;
        }
    }
    
}