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
public class Equipamentos {
  
    private String nome;
    private int quantidade;
    private String tipo;
    private String descricao;

    public Equipamentos(String nome, int quantidade, String tipo, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Equipamentos() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Equipamentos:" + "\nNome: " + nome + "\nQuantidade: " + quantidade + "\nTipo=" + tipo + "\nDescrição:" + descricao;
    }
    
    
    
    
}