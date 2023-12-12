package projetotcc.util;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import projetotcc.tabelas.Tblprodutos;

public class ProdutosDAO {
    private Session sessão;
    
    public ProdutosDAO(){
        sessão = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvarProduto(Tblprodutos tblprodutos){
        Transaction ts = sessão.beginTransaction();
        sessão.save(tblprodutos);
        ts.commit();
    }
    
    public void deletarProduto(Tblprodutos tblprodutos){
        Transaction ts = sessão.beginTransaction();
        sessão.delete(tblprodutos);
        ts.commit();
    }
    
    public void alterarProduto(Tblprodutos tblprodutos){
        Transaction ts = sessão.beginTransaction();
        sessão.update(tblprodutos);
        ts.commit();
    }
    
    public Tblprodutos procurarProduto(int idProduto){
        return (Tblprodutos) sessão.load(Tblprodutos.class, idProduto);
    }
    
    public List<Tblprodutos> listarProdutos(){
        List<Tblprodutos> animais = (List<Tblprodutos>) sessão.createQuery("from Tblprodutos ORDER BY codProd ASC").list();
        return animais;
    }
    
    public int ultimoProduto(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MAX(codProd) from Tblprodutos").uniqueResult();
        return x;
    }
    
    public int primeiroProduto(){
        int x = 0;
        x = (Integer) sessão.createQuery("SELECT MIN(codProd) from Tblprodutos").uniqueResult();
        return x;
    }
    
    public boolean existeProduto(int codigo){
        Query query = sessão.createQuery("from Tblprodutos where codProd = :cod or codProd like :cod");
        query.setInteger("cod", codigo);
        if(query.uniqueResult()!=null){
            return true;
        }else{
        return false;
        }
    }
    
    public List<Tblprodutos> listaProdutos(String filtro){
        Query query = sessão.createQuery("from Tblprodutos WHERE tipoProd = :filtro");
        query.setString("filtro", filtro);
        List<Tblprodutos> vacinas = (List<Tblprodutos>) query.list();
        return vacinas;
    }
}
