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
   private boolean locada;
   private int local_idlocal;
   private String tipo;
   private boolean status;

    public Sala(int capacidade_aluno,boolean locada, int local_idlocal, String tipo,boolean status) {
        this.capacidade_aluno = capacidade_aluno;
        this.locada = locada;
        this.local_idlocal = local_idlocal;
        this.tipo = tipo;
        this.status = status;
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

    public boolean isLocada() {
        return locada;
    }

    public void setLocada(boolean locada) {
        this.locada = locada;
    }

  

    public int getLocal_idlocal() {
        return local_idlocal;
    }

    public void setLocal_idlocal(int local_idlocal) {
        this.local_idlocal = local_idlocal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sala: " + "\nCapacidade_aluno: " + capacidade_aluno + "\nIdsala: " + idsala + "\nSala Locada: " + locada + "\nLocal_IDlocal: " + local_idlocal + "\nTipo: " + tipo + "\nStatus: " + status;
    }

    
 
   
   
   
   
}
