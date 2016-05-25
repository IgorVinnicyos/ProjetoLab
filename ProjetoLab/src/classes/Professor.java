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
public class Professor {
    
    private String nome;
    private String turno;
    private int salario;
    private String formacao;
    private int coordenador_idcoordenador;
    private int idprofessor;
    private int nota_avaliacao;

    public Professor(String nome, String turno, int salario, String formacao, int coordenador_idcoordenador, int idprofessor, int nota_avaliacao) {
        this.nome = nome;
        this.turno = turno;
        this.salario = salario;
        this.formacao = formacao;
        this.coordenador_idcoordenador = coordenador_idcoordenador;
        this.idprofessor = idprofessor;
        this.nota_avaliacao = nota_avaliacao;
    }
    

    

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

  
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getCoordenador_idcoordenador() {
        return coordenador_idcoordenador;
    }

    public void setCoordenador_idcoordenador(int coordenador_idcoordenador) {
        this.coordenador_idcoordenador = coordenador_idcoordenador;
    }

    public int getIdprofessor() {
        return idprofessor;
    }

    public void setIdprofessor(int idprofessor) {
        this.idprofessor = idprofessor;
    }

    public int getNota_avaliacao() {
        return nota_avaliacao;
    }

    public void setNota_avaliacao(int nota_avaliacao) {
        this.nota_avaliacao = nota_avaliacao;
    }

    @Override
    public String toString() {
        return "Professor: " + "\nNome: " + nome + "\nTurno: " + turno + "\nSalario: " + salario + "\nFormacao: " + formacao + "\nCoordenador_idcoordenador: " + coordenador_idcoordenador + "\nIdProfessor: " + idprofessor + "\nNota_Avaliacao: " + nota_avaliacao;
    }
  
    
    
    
}
