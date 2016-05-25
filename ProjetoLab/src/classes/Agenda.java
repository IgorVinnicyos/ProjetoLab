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
public class Agenda {
    
    private String dias_semanais;
    private String horario;
    private int idagenda;
    private int quantidade_dias;

    public Agenda(String dias_semanais, String horario, int idagenda, int quantidade_dias) {
        this.dias_semanais = dias_semanais;
        this.horario = horario;
        this.idagenda = idagenda;
        this.quantidade_dias = quantidade_dias;
    }

    public String getDias_semanais() {
        return dias_semanais;
    }

    public void setDias_semanais(String dias_semanais) {
        this.dias_semanais = dias_semanais;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdagenda() {
        return idagenda;
    }

    public void setIdagenda(int idagenda) {
        this.idagenda = idagenda;
    }

    public int getQuantidade_dias() {
        return quantidade_dias;
    }

    public void setQuantidade_dias(int quantidade_dias) {
        this.quantidade_dias = quantidade_dias;
    }

    @Override
    public String toString() {
        return "Agenda: " + "\nDias_Semanais: " + dias_semanais + "\nHorario: " + horario + "\nIDagenda: " + idagenda + "\nQuantidade_dias: " + quantidade_dias;
    }
    
    
    
    
    
}
