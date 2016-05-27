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
    
 public static int inserirCoordenador(Coordenador c, Connection con){
 int id = 0;
     
     try{
   
     
     String sql = "insert into coordenador " +
        "(nome,turno, salario,professor,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(c);
     
     stmt.setString(1, c.getNome());
     stmt.setString(2,c.getTurno());
     stmt.setDouble(3,c.getSalario());
     stmt.setBoolean(4,c.getProfessor());
     stmt.setBoolean(5,true);
     
     
    stmt.execute();
    ResultSet rs = stmt.getGeneratedKeys();

   
   while(rs.next()){
   
       id = rs.getInt(1);
   }
   
     System.out.println(id);
    
   stmt.close();
      System.out.println("inseriu!!!");
     }catch(SQLException e){
         
     System.out.println(e);
     }
     
     return id;
 }  
 
 
 
 public static int inserirDisciplica(Disciplina d, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into coordenador " +
        "(professor_idprofessor,status,disciplina)" +
        " values (?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(d);
     
     stmt.setInt(1, d.getProfessor_idprofessor());
     stmt.setBoolean(2,true);
     stmt.setString(3,d.getDisciplina());
     
    stmt.execute();
    
     ResultSet rs = stmt.getGeneratedKeys();

   
   while(rs.next()){
   
       id = rs.getInt(1);
   }
    stmt.close();
      System.out.println("inseriu!!!");
     }catch(SQLException e){
         
     System.out.println(e);
     }
 return id;
 }
 
 
}
    



