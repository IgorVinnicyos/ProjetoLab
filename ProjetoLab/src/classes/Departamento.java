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
    
    private int iddepartamento;
    private String horario;
    private int local_idlocal;
    private String responsavel;
    private String tipo;

    public Departamento(int iddepartamento, String horario, int local_idlocal, String responsavel, String tipo) {
        this.iddepartamento = iddepartamento;
        this.horario = horario;
        this.local_idlocal = local_idlocal;
        this.responsavel = responsavel;
        this.tipo = tipo;
    }

    public int getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(int iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getLocal_idlocal() {
        return local_idlocal;
    }

    public void setLocal_idlocal(int local_idlocal) {
        this.local_idlocal = local_idlocal;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Departamento: " + "\nIddepartamento: " + iddepartamento + "\nHorario: " + horario + "\nLocal_IDlocal: " + local_idlocal + "\nResponsavel: " + responsavel + "\nTipo: " + tipo;
    }
 
     
    
    
}