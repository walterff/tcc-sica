package projetotcc.util;

import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblclientes;
import projetotcc.tabelas.Tblcontasrecebe;
import projetotcc.tabelas.Tblvendas;

public class ContasReceberDAO {

    private Session sessão;

    public ContasReceberDAO() {
        sessão = HibernateUtil.getSessionFactory().openSession();
    }

    public void salvarConta(Tblcontasrecebe tblcontasrecebe) {
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblcontasrecebe);
        ts.commit();
    }

    public void deletarConta(Tblcontasrecebe tblcontasrecebe) {
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblcontasrecebe);
        ts.commit();
    }

    public void alterarConta(Tblcontasrecebe tblcontasrecebe) {
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblcontasrecebe);
        ts.commit();
    }

    public Tblcontasrecebe procurarConta(int idConta) {
        return (Tblcontasrecebe) sessão.load(Tblcontasrecebe.class, idConta);
    }

    public List<Tblcontasrecebe> listarContas() {
        List<Tblcontasrecebe> contas = (List<Tblcontasrecebe>) sessão.createQuery("from Tblcontasrecebe ORDER BY codConta ASC").list();
        return contas;
    }

    public int ultimoConta() {
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codConta) from Tblcontasrecebe").uniqueResult();
        return x;
    }

    public int primeiroConta() {
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codConta) from Tblcontasrecebe").uniqueResult();
        return x;
    }

    public boolean existeConta(int codigo) {
        Query query = sessão.createQuery("from Tblcontasrecebe where codConta = :cod or codConta like :cod");
        query.setInteger("cod", codigo);
        if (query.uniqueResult() != null) {
            return true;
        } else {
            return false;
        }
    }

    public List<Tblclientes> listaNomeCliente(String cliente) {
        cliente = "%" + cliente + "%";
        Query query = sessão.createQuery("from Tblclientes WHERE nomeCli = :cliente  OR nomeCli like :cliente");
        query.setString("cliente", cliente);
        List<Tblclientes> clientes = (List<Tblclientes>) query.list();
        return clientes;
    }

    public List<Tblvendas> listaVendas(Date vencimentoInicio, Date vencimentoFinal, String cliente) {
        cliente = "%" + cliente + "%";
        Query query = sessão.createQuery("from Tblvendas WHERE vencimentoVenda >= :vencimentoInicio AND vencimentoVenda <= :vencimentoFinal AND nomeCli like :cliente AND saldoVenda < 0");
        query.setDate("vencimentoInicio", vencimentoInicio);
        query.setDate("vencimentoFinal", vencimentoFinal);
        query.setString("cliente", cliente);
        List<Tblvendas> vendas = (List<Tblvendas>) query.list();
        return vendas;
    }
    
    public List<Tblvendas> listaVendasData(Date vencimentoInicio, Date vencimentoFinal) {
        Query query = sessão.createQuery("from Tblvendas WHERE vencimentoVenda >= :vencimentoInicio AND vencimentoVenda <= :vencimentoFinal AND saldoVenda < 0");
        query.setDate("vencimentoInicio", vencimentoInicio);
        query.setDate("vencimentoFinal", vencimentoFinal);
        List<Tblvendas> vendas = (List<Tblvendas>) query.list();
        return vendas;
    }
    
    public List<Tblvendas> listaTodosSaldos(){
        List<Tblvendas> saldos = (List<Tblvendas>) sessão.createQuery("from Tblvendas WHERE saldoVenda < 0 ORDER BY codVenda ASC").list();
        return saldos;
    }
}
