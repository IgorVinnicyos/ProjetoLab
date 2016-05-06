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
public class Coordenador {
    private String nome;
    private String diciplina;
    private String turno;
    private int codigo; 
    private int salario; 

    public Coordenador(String nome, String diciplina, String turno, int codigo, int salario) {
        this.nome = nome;
        this.diciplina = diciplina;
        this.turno = turno;
        this.codigo = codigo;
        this.salario = salario;
    }

    public Coordenador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Coordenador: " + "\nNome: " + nome + "\nDiciplina: " + diciplina + "\nTurno: " + turno + "\nCodigo: " + codigo + "\nSalario: " + salario ;
    }

   
    
    
    
    
    
    
    
}
