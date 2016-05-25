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
    private String professor_idprofessor;

    public Disciplina(String disciplina, String professor_idprofessor) {
        this.disciplina = disciplina;
        this.professor_idprofessor = professor_idprofessor;
    }

    public Disciplina() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
       public String getProfessor_idprofessor() {
        return professor_idprofessor;
    }

    public void setProfessor_idprofessor(String professor_idprofessor) {
        this.professor_idprofessor = professor_idprofessor;
    }

    @Override
    public String toString() {
        return "Disciplina: " + disciplina + "\n Professor_IdProfessor: " + professor_idprofessor ;
    }

   
}
