package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblitensvacinas;

public class ItensVacinasDAO {
    private Session sessão;
    
    public ItensVacinasDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarItenVacina(Tblitensvacinas tblitensvacinas){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblitensvacinas);
        ts.commit();
    }
    
    public Tblitensvacinas procurarItenVacina(int idItenVacina){
        return (Tblitensvacinas) sessão.load(Tblitensvacinas.class, idItenVacina);
    }
    
    public List<Tblitensvacinas> listarItensVacinas(){
        List<Tblitensvacinas> itensvacinas = (List<Tblitensvacinas>) sessão.createQuery("from Tblitensvacinas ORDER BY codItemVacina ASC").list();
        return itensvacinas;
    }
    
    public List<Tblitensvacinas> listarItensVacinasCod(int codigo){
        Query query = sessão.createQuery("from Tblitensvacinas WHERE tblAnimaisCodAni = :codigoanimal");
        query.setInteger("codigoanimal", codigo);
        List<Tblitensvacinas> itensvacinas = (List<Tblitensvacinas>) query.list();
        return itensvacinas;
    }
}