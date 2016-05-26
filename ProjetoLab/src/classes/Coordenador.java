/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 151091797
 */
public class Coordenador {
    private String nome;
    private boolean professor;
    private String turno;
    private int idcoordenador; 
    private double salario;
    private boolean status;
   

    public Coordenador(String nome, String turno,  double salario,boolean professor,boolean status) {
        this.nome = nome;
        this.professor = professor;
        this.turno = turno;
        this.status = status;
        this.salario = salario;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    public Coordenador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getIdcoordenador() {
        return idcoordenador;
    }

    public void setIdcoordenador(int idcoordenador) {
        this.idcoordenador = idcoordenador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Coordenador: " + "\nNome: " + nome + "\nProfessor: " + professor + "\nTurno: " + turno + "\nCodigo: " + idcoordenador + "\nSalario: " + salario + "\nStatus: " + status;
    }

   
    
    
    
    
    
    
    
}
