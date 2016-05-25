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
public class Sala {
    
   private int capacidade_aluno;
   private int idsala;
   private String locada;
   private String local_idlocal;
   private String tipo;

    public Sala(int capacidade_aluno, int idsala, String locada, String local_idlocal, String tipo) {
        this.capacidade_aluno = capacidade_aluno;
        this.idsala = idsala;
        this.locada = locada;
        this.local_idlocal = local_idlocal;
        this.tipo = tipo;
    }

    public int getCapacidade_aluno() {
        return capacidade_aluno;
    }

    public void setCapacidade_aluno(int capacidade_aluno) {
        this.capacidade_aluno = capacidade_aluno;
    }

    public int getIdsala() {
        return idsala;
    }

    public void setIdsala(int idsala) {
        this.idsala = idsala;
    }

    public String getLocada() {
        return locada;
    }

    public void setLocada(String locada) {
        this.locada = locada;
    }

    public String getLocal_idlocal() {
        return local_idlocal;
    }

    public void setLocal_idlocal(String local_idlocal) {
        this.local_idlocal = local_idlocal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Sala: " + "\nCapacidade_aluno: " + capacidade_aluno + "\nIdsala: " + idsala + "\nSala Locada: " + locada + "\nLocal_IDlocal: " + local_idlocal + "\nTipo: " + tipo;
    }

    
 
   
   
   
   
}
