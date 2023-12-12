package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblitensvendas;

public class ItensVendasDAO {
    private Session sessão;
    
    public ItensVendasDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarItenVenda(Tblitensvendas tblitensvendas){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblitensvendas);
        ts.commit();
    }
    
    public Tblitensvendas procurarItenVenda(int idItenVenda){
        return (Tblitensvendas) sessão.load(Tblitensvendas.class, idItenVenda);
    }
    
    public List<Tblitensvendas> listarItensVendas(){
        List<Tblitensvendas> itensvendas = (List<Tblitensvendas>) sessão.createQuery("from Tblitensvendas ").list();
        return itensvendas;
    }
    
    public List<Tblitensvendas> listarItensVendasCod(int codigo){
        Query query = sessão.createQuery("from Tblitensvendas WHERE tblVendasCodVenda = :codigovenda");
        query.setInteger("codigovenda", codigo);
        List<Tblitensvendas> itensvendas = (List<Tblitensvendas>) query.list();
        return itensvendas;
    }
}
