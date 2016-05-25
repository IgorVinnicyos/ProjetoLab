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

    public Telefone(int departamento_iddepartamento, int numero) {
        this.departamento_iddepartamento = departamento_iddepartamento;
        this.numero = numero;
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

    @Override
    public String toString() {
        return "Telefone: " + "\nDepartamento_IDdepartamento: " + departamento_iddepartamento + "\nNumero: " + numero;
    }
    
    
    
    
}
