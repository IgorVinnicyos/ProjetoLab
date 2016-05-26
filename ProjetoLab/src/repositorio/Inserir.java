/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import classes.*;
import java.sql.*;


import conexao.Conecta;
/**
 *
 * @author igor_
 */




/**
 *
 * @author 151091797
 */
public class Inserir {
    
 public static void inserirCoordenador(Coordenador c, Connection con){
 
     
     try{
   
     
     String sql = "insert into coordenador " +
        "(nome,turno, salario,professor,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql);
      System.out.println(c);
     
     stmt.setString(1, c.getNome());
     stmt.setString(2,c.getTurno());
     stmt.setDouble(3,c.getSalario());
     stmt.setBoolean(4,c.getProfessor());
     stmt.setBoolean(5,true);
     
     
    stmt.execute();
    stmt.close();
      System.out.println("inseriu!!!");
     }catch(SQLException e){
         
     System.out.println(e);
     }
     
     
 }  
 
 
 
 public static void inserirDisciplica(Disciplina d, Connection con){
 
  try{
   
     
     String sql = "insert into coordenador " +
        "(idprofessor,disciplina)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql);
      System.out.println(d);
     
    /* stmt.setString(1, d.getNome());
     stmt.setString(2,d.getTurno());
     stmt.setDouble(3,c.getSalario());
     stmt.setBoolean(4,c.getProfessor());
     stmt.setBoolean(5,true);*/
     
     
    stmt.execute();
    stmt.close();
      System.out.println("inseriu!!!");
     }catch(SQLException e){
         
     System.out.println(e);
     }
 
 }
 
 
}
    



