/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.*;

/**
 *
 * @author igor_
 */
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conecta {
    
    public Statement stm;
    public ResultSet rst;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho= "jdbc:mysql://localhost:3306/projeto_lab";
    private String usuario = "root";
    private String senha = "";
    public Connection con ;
    
    
   public  Connection Conecta(){
   
    
   
        try {
           
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho,usuario, senha);
            
            JOptionPane.showMessageDialog(null,"conectado com sucesso!!!");
        } catch (SQLException ex) {
           
             JOptionPane.showMessageDialog(null,"Erro de conexao!!"+"Error: \n"+ex.getMessage());
      
        }
   return con;
   } 
   public void Desconecta(){
   
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"desconectado com sucesso!!!");
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Erro ao desconectar!!"+"Error: \n"+ex.getMessage());
        }
   
   }
    
}
