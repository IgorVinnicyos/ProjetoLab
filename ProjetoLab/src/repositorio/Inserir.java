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
 
 
 
 public static int inserirDisciplina(Disciplina d, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into diciplina " +
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
 
 public static int inseriraAcesso(Acesso a, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into acesso " +
        "(login,senha,coordenador_idcoordenador,professor_idprofessor,funcionario_idfuncionario,status)" +
        " values (?,?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(a);
     
     stmt.setString(1, a.getLogin());
     stmt.setString(2, a.getSenha());
     stmt.setInt(3, a.getCoordenador_idcoordenador());
     stmt.setInt(4, a.getProfessor_idprofessor());
     stmt.setInt(5, a.getFuncionario_idfuncionario());
     stmt.setBoolean(6,true);
   
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
 
 public static int inserirAgenda(Agenda ag, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into agenda " +
        "(horario,quantidade_dias,dias_semanais,status)" +
        " values (?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(ag);
     
     stmt.setString(1, ag.getHorario());
     stmt.setInt(2, ag.getQuantidade_dias());
     stmt.setString(3, ag.getDias_semanais());
     stmt.setBoolean(4,true);
    
     
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
 
 public static int inserirDepartamento(Departamento dp, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into departamento " +
        "(horario,tipo,reponsavel,local_idlocal,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(dp);
     
     stmt.setString(1, dp.getHorario());
     stmt.setString(2, dp.getTipo());
     stmt.setString(3, dp.getResponsavel());
     stmt.setInt(4, dp.getLocal_idlocal());
     stmt.setBoolean(5,true);
    
     
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
 
  public static int inserirEquipamentos(Equipamentos eq, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into equipamentos " +
        "(nome,quantidade,tipo,descricao,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(eq);
     
     stmt.setString(1, eq.getNome());
     stmt.setInt(2, eq.getQuantidade());
     stmt.setString(3, eq.getTipo());
     stmt.setString(4, eq.getDescricao());
     stmt.setBoolean(5,true);
    
     
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
 
  public static int inserirFuncionario(Funcionario f, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into funcionario " +
        "(nome,cargo,salario,departamento_iddepartamento,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(f);
     
     stmt.setString(1, f.getNome());
     stmt.setString(2, f.getCargo());
     stmt.setDouble(3, f.getSalario());
     stmt.setInt(4, f.getDepartamento_iddepartamento());
     stmt.setBoolean(5,true);
    
     
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
 
   public static int inserirLocaSala(LocaSala ls, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into locaSala " +
        "(horario,dia,autorizacao,professor_idprofessor,sala_idsala,coordenador_idcoordenador,agenda_idagenda,status)" +
        " values (?,?,?,?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(ls);
     
     stmt.setString(1, ls.getHorario());
     stmt.setDate(2, (Date) ls.getDia());
     stmt.setBoolean(3, ls.getAutorizacao());
     stmt.setInt(4, ls.getProfessor_idprofessor());
     stmt.setInt(5, ls.getSala_idsala());
     stmt.setInt(6, ls.getCoordenador_idcoordenador());
     stmt.setInt(7, ls.getAgenda_idagenda());
     stmt.setBoolean(8,true);
    
     
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
 
   
   
 public static int inserirLocal(Local l, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into local " +
        "(bloco,andar,codigo,status)" +
        " values (?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(l);
     
     stmt.setString(1, l.getBloco());
     stmt.setString(2, l.getAndar());
     stmt.setString(2, l.getCodigo());
     stmt.setBoolean(5,true);
    
     
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
 
 
    public static int inserirProfessor(Professor p, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into professor " +
        "(nome,formacao,turno,salario,salario,nota_avaliacao,status)" +
        " values (?,?,?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(p);
     
     stmt.setString(1, p.getNome());
     stmt.setString(2, p.getFormacao());
     stmt.setString(3, p.getTurno());
     stmt.setDouble(4, p.getSalario());
     stmt.setInt(5, p.getCoordenador_idcoordenador());
     stmt.setInt(6, p.getNota_avaliacao());
     stmt.setBoolean(7,true);
    
     
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
 
 
     public static int inserirSala(Sala s, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into sala " +
        "(capacidade_aluno,tipo,locada,local_idlocal,status)" +
        " values (?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(s);
     
     stmt.setInt(1, s.getCapacidade_aluno());
     stmt.setString(2, s.getTipo());
     stmt.setBoolean(3, s.getLocada());
     stmt.setInt(4, s.getLocal_idlocal());
     stmt.setBoolean(5,true);
    
     
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
    
     
      public static int inserirSolicitacao(Solicitacao sl, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into solicitacao " +
        "(horario,numero_protocolo,data_solicitacao,sala_idsala,professor_idprofessor,departamento_iddepartamento,status)" +
        " values (?,?,?,?,?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(sl);
     
     stmt.setString(1, sl.getHorario());
     stmt.setInt(2, sl.getNumero_protocolo());
     stmt.setDate(3,sl.getData_solicitacao());
     stmt.setInt(4, sl.getSala_idsala());
     stmt.setInt(5, sl.getProfessor_idprofessor());
     stmt.setInt(6, sl.getDepatarmento_iddepartamento());
     stmt.setBoolean(7,true);
    
     
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
    
      public static int inserirTelefone(Telefone  t, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into telefone " +
        "(departamento_iddepartamento,numero,status)" +
        " values (?,?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(t);
     
     stmt.setInt(1, t.getDepartamento_iddepartamento());
     stmt.setInt(2, t.getNumero());
     stmt.setBoolean(3,true);
    
     
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
      
      
 
       public static int inserirEquipamentos_solicitados(equipamentos_solicitados  es, Connection con){
 int id= 0;
  try{
   
     
     String sql = "insert into equipamentos_solicitados " +
        "(quantidade,status)" +
        " values (?,?)"; 
     
     PreparedStatement stmt = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
      System.out.println(es);
     
     stmt.setInt(1, es.getQuantidade());
     stmt.setBoolean(2,true);
    
     
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
