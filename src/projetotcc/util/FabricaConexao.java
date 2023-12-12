/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotcc.util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Walter
 */
public class FabricaConexao {
    private String url = "jdbc:mysql://localhost:3306/bdleite";
    private String usuario = "root";
    private String senha = ""; //Neste PC não tem senha de root
    
    //método da conexão
    
    public Connection getConexao (){
        try{
            System.out.println("Conectado com o BD");
            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
