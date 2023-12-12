package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblclientes;
import projetotcc.tabelas.Tblprodutos;
import projetotcc.tabelas.Tblvendas;

public class VendasDAO {
    private Session sessão;
    
    public VendasDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarVenda(Tblvendas tblvendas){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblvendas);
        ts.commit();
    }
    
    public void deletarVenda(Tblvendas tblvendas){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblvendas);
        ts.commit();
    }
    
    public void alterarVenda(Tblvendas tblvendas){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblvendas);
        ts.commit();
    }
    
    public Tblvendas procurarVenda(int idVenda){
        return (Tblvendas) sessão.load(Tblvendas.class, idVenda);
    }
    
    public List<Tblvendas> listarVendas(){
        List<Tblvendas> vendas = (List<Tblvendas>) sessão.createQuery("from Tblvendas").list();
        return vendas;
    }
    
    public int ultimoVenda(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codVenda) from Tblvendas").uniqueResult();
        return x;
    }
    
    public int primeiroVenda(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codVenda) from Tblvendas").uniqueResult();
        return x;
    }
    
    public boolean existeVenda(int codigo){
        Query query = sessão.createQuery("from Tblvendas where codVenda = :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public List<Tblclientes> listaNomeClientes(String nome){
        nome = "%"+nome+"%";
        Query query = sessão.createQuery("from Tblclientes where nomeCli = :nome or nomeCli like :nome");
        query.setString("nome", nome);
        List<Tblclientes> clientes = (List<Tblclientes>) query.list();
        return clientes;
    }
    
    public List<Tblprodutos> listaTipoProdutos(String tipo){
        tipo = "%"+tipo+"%";
        Query query = sessão.createQuery("from Tblprodutos where tipoProd = :tipo or tipoProd like :tipo");
        query.setString("tipo", tipo);
        List<Tblprodutos> produtos = (List<Tblprodutos>) query.list();
        return produtos;
    }
    
    public List<Tblprodutos> listaCodProdutos(String codigo){
        codigo = "%"+codigo+"%";
        Query query = sessão.createQuery("from Tblprodutos where codProd = :codigo or codProd like :codigo");
        query.setString("codigo", codigo);
        List<Tblprodutos> produtos = (List<Tblprodutos>) query.list();
        return produtos;
    }
    
}
