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
public class Telefone {
    
    private int departamento_iddepartamento;
    private int numero;
    private boolean status;

    public Telefone(int departamento_iddepartamento, int numero,boolean status) {
        this.departamento_iddepartamento = departamento_iddepartamento;
        this.numero = numero;
        this.status = status;
    }

    public int getDepartamento_iddepartamento() {
        return departamento_iddepartamento;
    }

    public void setDepartamento_iddepartamento(int departamento_iddepartamento) {
        this.departamento_iddepartamento = departamento_iddepartamento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    

    @Override
    public String toString() {
        return "Telefone: " + "\nDepartamento_IDdepartamento: " + departamento_iddepartamento + "\nNumero: " + numero + "\nStatus: " + status;
    }
    
    
    
    
}
