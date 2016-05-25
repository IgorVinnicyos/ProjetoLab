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
public class Funcionario {
    private String cargo;
    private int departamento_iddepartamento;
    private int idfuncionario;
    private String nome;
    private double salario;

    public Funcionario(String cargo, int departamento_iddepartamento, int idfuncionario, String nome, double salario) {
        this.cargo = cargo;
        this.departamento_iddepartamento = departamento_iddepartamento;
        this.idfuncionario = idfuncionario;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getDepartamento_iddepartamento() {
        return departamento_iddepartamento;
    }

    public void setDepartamento_iddepartamento(int departamento_iddepartamento) {
        this.departamento_iddepartamento = departamento_iddepartamento;
    }

    public int getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + "\nCargo: " + cargo + "\nDepartamento_IDdepartamento: " + departamento_iddepartamento + "\nIDfuncionario: " + idfuncionario + "\nNome: " + nome + "\nSalario: " + salario;
    }
    
    
    
    
}
