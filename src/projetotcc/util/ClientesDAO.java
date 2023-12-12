package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblclientes;

public class ClientesDAO {
    private Session sessão;
    
    public ClientesDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarCliente(Tblclientes tblclientes){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblclientes);
        ts.commit();
    }
    
    public void deletarCliente(Tblclientes tblclientes){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblclientes);
        ts.commit();
    }
    
    public void alterarCliente(Tblclientes tblclientes){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblclientes);
        ts.commit();
    }
    
    public Tblclientes procurarCliente(int idCliente){
        return (Tblclientes) sessão.load(Tblclientes.class, idCliente);
    }
    
    public List<Tblclientes> listarClientes(){
        List<Tblclientes> clientes = (List<Tblclientes>) sessão.createQuery("from Tblclientes ORDER BY nomeCli ASC").list();
        return clientes;
    }
    
    public int ultimoCliente(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codCli) from Tblclientes").uniqueResult();
        return x;
    }
    
    public int primeiroCliente(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codCli) from Tblclientes").uniqueResult();
        return x;
    }
    
    public boolean existeCliente(int codigo){
        Query query = sessão.createQuery("from Tblclientes where codCli = :cod");
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
    
    public List<Tblclientes> listaCidades(String cidade){
        cidade = "%"+cidade+"%";
        Query query = sessão.createQuery("from Tblclientes where cidadeCli = :cidade or cidadeCli like :cidade");
        query.setString("cidade", cidade);
        List<Tblclientes> clientes = (List<Tblclientes>) query.list();
        return clientes;
    }
    
    public List<Tblclientes> listaUF(int UF){
        Query query = sessão.createQuery("from Tblclientes where ufCli = :UF");
        query.setInteger("UF", UF);
        List<Tblclientes> clientes = (List<Tblclientes>) query.list();
        return clientes;
    }
    
    
    
}