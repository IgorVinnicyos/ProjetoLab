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
public class equipamentos_solicitados {
 
    
    private int equipamentos_idequipamentos;
    private int quantidade;
    private int solicitacao_idsolicitacao;
    private boolean status;

    public equipamentos_solicitados(int equipamentos_idequipamentos, int quantidade, int solicitacao_idsolicitacao,boolean status) {
        this.equipamentos_idequipamentos = equipamentos_idequipamentos;
        this.quantidade = quantidade;
        this.solicitacao_idsolicitacao = solicitacao_idsolicitacao;
        this.status = status;
    }

    public int getEquipamentos_idequipamentos() {
        return equipamentos_idequipamentos;
    }

    public void setEquipamentos_idequipamentos(int equipamentos_idequipamentos) {
        this.equipamentos_idequipamentos = equipamentos_idequipamentos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getSolicitacao_idsolicitacao() {
        return solicitacao_idsolicitacao;
    }

    public void setSolicitacao_idsolicitacao(int solicitacao_idsolicitacao) {
        this.solicitacao_idsolicitacao = solicitacao_idsolicitacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }  
    
    
    @Override
    public String toString() {
        return "Equipamentos_solicitados: " + "\nEquipamentos_idequipamentos: " + equipamentos_idequipamentos + ",\nQuantidade: " + quantidade + "\nSolicitacao_IDsolicitacao: " + solicitacao_idsolicitacao + "\nStatus: " + status;
    }
    
    
    
    
    
    
    
    
    
}