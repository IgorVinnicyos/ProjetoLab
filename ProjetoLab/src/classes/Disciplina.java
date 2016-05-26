/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 151090678
 */
public class Disciplina {
    
    private String disciplina;
    private int  professor_idprofessor;
    private boolean status;

    public Disciplina(String disciplina, int professor_idprofessor,boolean status) {
        this.disciplina = disciplina;
        this.professor_idprofessor = professor_idprofessor;
        this.status = status;
    }

    public Disciplina() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
       public int getProfessor_idprofessor() {
        return professor_idprofessor;
    }

    public void setProfessor_idprofessor(int professor_idprofessor) {
        this.professor_idprofessor = professor_idprofessor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
  
    
    @Override
    public String toString() {
        return "Disciplina: " + disciplina + "\n Professor_IdProfessor: " + professor_idprofessor +"\nStatus: " + status;
    }

   
}
