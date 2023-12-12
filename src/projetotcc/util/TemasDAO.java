package projetotcc.util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tbltema;

public class TemasDAO {
    private Session sessão;
    
    public TemasDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void atulizaTema(Tbltema tbltema){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tbltema);
        ts.commit();
    }
    
    public int primeiroTema(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codTema) from Tbltema").uniqueResult();
        return x;
    }
    
    public Tbltema carregaTema(int idTema){
        return (Tbltema) sessão.load(Tbltema.class, idTema);
    }
    
    public boolean existeTema(int codigo){
        Query query = sessão.createQuery("from Tbltema where codTema = :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
        return false;
        }
    }
    
}
