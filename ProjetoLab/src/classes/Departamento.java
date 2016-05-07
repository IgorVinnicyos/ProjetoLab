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
public class Departamento {
    
    private int numero;
    private String telefone;
    private String horario;
    private String bloco;
    private String andar;
    private String funcionarios;
    
    
    

    public Departamento(int numero, String telefone, String bloco, String andar, String funcionarios) {
        this.numero = numero;
        this.telefone = telefone;
        this.bloco = bloco;
        this.andar = andar;
        this.funcionarios = funcionarios;
        
        
    }

    public Departamento() {
    }
    

    public String getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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

    @Override
    public String toString() {
        return "Departamento" + "\nNumero: " + numero + ", \nTelefone: " + telefone + ", \nHorario: " + horario + ", \nBloco: " + bloco + ", \nAndar: " + andar + ", /nFuncionarios: " + funcionarios;
    }
    
    
    
    
    
    
   
    
}
