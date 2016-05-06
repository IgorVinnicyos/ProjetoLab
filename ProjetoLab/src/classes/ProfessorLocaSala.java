/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author J.Anderson
 */
public class ProfessorLocaSala {
    
    private int horario;
    private Date dia;
    private int autorizacao;
    private int cod_professor;
    private int cod_sala;
    private int cod_coordenador;

    public ProfessorLocaSala(int horario, Date dia, int autorizacao, int cod_professor, int cod_sala, int cod_coordenador) {
        this.horario = horario;
        this.dia = dia;
        this.autorizacao = autorizacao;
        this.cod_professor = cod_professor;
        this.cod_sala = cod_sala;
        this.cod_coordenador = cod_coordenador;
    }

    public ProfessorLocaSala() {
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public int getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(int autorizacao) {
        this.autorizacao = autorizacao;
    }

    public int getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }

    public int getCod_sala() {
        return cod_sala;
    }

    public void setCod_sala(int cod_sala) {
        this.cod_sala = cod_sala;
    }

    public int getCod_coordenador() {
        return cod_coordenador;
    }

    public void setCod_coordenador(int cod_coordenador) {
        this.cod_coordenador = cod_coordenador;
    }

    @Override
    public String toString() {
        return "ProfessorLocaSala: " + "\nHorario: " + horario + "\nDia: " + dia + "\nAutorizacao: " + autorizacao + "\nCod_Professor: " + cod_professor + "\nCod_Sala: " + cod_sala + "\nCod_Coordenador: " + cod_coordenador ;
    }
    
    
    
    
    
    
}
