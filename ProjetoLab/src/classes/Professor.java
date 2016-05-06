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
    private String disciplina;
    private String turno;
    private int salario;

    public Professor(String nome, String disciplina, String turno, int salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.turno = turno;
        this.salario = salario;
    }

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
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

    @Override
    public String toString() {
        return "Professor: " + "\nNome: " + nome + "\nDisciplina: " + disciplina + "\nTurno: " + turno + "\nSalario=" + salario ;
    }
  
    
}
