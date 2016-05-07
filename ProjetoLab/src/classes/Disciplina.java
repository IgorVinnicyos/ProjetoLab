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

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Disciplina() {
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Disciplina" + "\nDisciplina: " + disciplina;
    }
    
    
    
    
}
