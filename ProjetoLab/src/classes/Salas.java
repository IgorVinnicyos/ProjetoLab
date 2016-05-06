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
public class Salas {
    
   private int capacidade_alunos;
   private int codigo;
   private String bloco;
   private String andar;
   private String tipo;

    public Salas(int capacidade_alunos, int codigo, String bloco, String andar, String tipo) {
        this.capacidade_alunos = capacidade_alunos;
        this.codigo = codigo;
        this.bloco = bloco;
        this.andar = andar;
        this.tipo = tipo;
    }

    public Salas() {
    }

    public int getCapacidade_alunos() {
        return capacidade_alunos;
    }

    public void setCapacidade_alunos(int capacidade_alunos) {
        this.capacidade_alunos = capacidade_alunos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Salas: " + "\nCapacidade_alunos: " + capacidade_alunos + "\nCodigo: " + codigo + "\nBloco: " + bloco + "\nAndar: " + andar + "\nTipo: " + tipo;
    }
 
   
   
   
   
   
}
