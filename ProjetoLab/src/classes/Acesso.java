/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author J.Anderson
 */
public class Acesso {
    private int coordenador_idcoordenador;
    private int funcionario_idfuncionario;
    private int idacesso;
    private String login;
    private int professor_idprofessor;
    private String senha;
    private boolean status;

    public Acesso(int coordenador_idcoordenador, int funcionario_idfuncionario, String login, int professor_idprofessor, String senha, boolean status) {
        this.coordenador_idcoordenador = coordenador_idcoordenador;
        this.funcionario_idfuncionario = funcionario_idfuncionario;
        this.login = login;
        this.professor_idprofessor = professor_idprofessor;
        this.senha = senha;
        this.status = status;
        
    }

  public Acesso( String login,int idacesso,String senha){
  this.login = login;
  this.senha = senha;
  this.idacesso = idacesso;
  }

    public int getCoordenador_idcoordenador() {
        return coordenador_idcoordenador;
    }

    public void setCoordenador_idcoordenador(int coordenador_idcoordenador) {
        this.coordenador_idcoordenador = coordenador_idcoordenador;
    }

    public int getFuncionario_idfuncionario() {
        return funcionario_idfuncionario;
    }

    public void setFuncionario_idfuncionario(int funcionario_idfuncionario) {
        this.funcionario_idfuncionario = funcionario_idfuncionario;
    }

    public int getIdacesso() {
        return idacesso;
    }

    public void setIdacesso(int idacesso) {
        this.idacesso = idacesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getProfessor_idprofessor() {
        return professor_idprofessor;
    }

    public void setProfessor_idprofessor(int professor_idprofessor) {
        this.professor_idprofessor = professor_idprofessor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
        public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
    @Override
    public String toString() {
        return "Acesso: " + "\nCoordenador_IDcoordenador: " + coordenador_idcoordenador + "\nFuncionario_IDfuncionario: " + funcionario_idfuncionario + "\nIDacesso: " + idacesso + "\nLogin: " + login + "\nProfessor_IDprofessor: " + professor_idprofessor + "\nSenha: " + senha + "\nStatus: " + status;
    }


    
    
    
    
    
    
    
    
    
    
}
