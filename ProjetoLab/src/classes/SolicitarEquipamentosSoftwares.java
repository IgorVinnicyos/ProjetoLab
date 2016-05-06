/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author 151091797
 */
public class SolicitarEquipamentosSoftwares {
   private int quantidade;
   private int numero_protocolo;
   private Date data_solicitacao;

    public SolicitarEquipamentosSoftwares(int quantidade, int numero_protocolo, Date data_solicitacao) {
        this.quantidade = quantidade;
        this.numero_protocolo = numero_protocolo;
        this.data_solicitacao = data_solicitacao;
    }

    public SolicitarEquipamentosSoftwares() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumero_protocolo() {
        return numero_protocolo;
    }

    public void setNumero_protocolo(int numero_protocolo) {
        this.numero_protocolo = numero_protocolo;
    }

    public Date getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(Date data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    @Override
    public String toString() {
        return "Solicitar Equipamentos Softwares: " + "\nQuantidade: " + quantidade + "\nNumero protocolo: " + numero_protocolo + "\nData solicitaçã: " + data_solicitacao ;
    }
   
   
    
}
