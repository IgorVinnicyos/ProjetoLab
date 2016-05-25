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
public class LocaSala {
    
    private int horario;
    private Date dia;
    private int autorizacao;
    private int agenda_idagenda;
    private int coordenador_idcoordenador;
    private int idloca_sala;
    private int professor_idprofessor;
    private int sala_idsala;

    public LocaSala(int horario, Date dia, int autorizacao, int agenda_idagenda, int coordenador_idcoordenador, int idloca_sala, int professor_idprofessor, int sala_idsala) {
        this.horario = horario;
        this.dia = dia;
        this.autorizacao = autorizacao;
        this.agenda_idagenda = agenda_idagenda;
        this.coordenador_idcoordenador = coordenador_idcoordenador;
        this.idloca_sala = idloca_sala;
        this.professor_idprofessor = professor_idprofessor;
        this.sala_idsala = sala_idsala;
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

    public int getAgenda_idagenda() {
        return agenda_idagenda;
    }

    public void setAgenda_idagenda(int agenda_idagenda) {
        this.agenda_idagenda = agenda_idagenda;
    }

    public int getCoordenador_idcoordenador() {
        return coordenador_idcoordenador;
    }

    public void setCoordenador_idcoordenador(int coordenador_idcoordenador) {
        this.coordenador_idcoordenador = coordenador_idcoordenador;
    }

    public int getIdloca_sala() {
        return idloca_sala;
    }

    public void setIdloca_sala(int idloca_sala) {
        this.idloca_sala = idloca_sala;
    }

    public int getProfessor_idprofessor() {
        return professor_idprofessor;
    }

    public void setProfessor_idprofessor(int professor_idprofessor) {
        this.professor_idprofessor = professor_idprofessor;
    }

    public int getSala_idsala() {
        return sala_idsala;
    }

    public void setSala_idsala(int sala_idsala) {
        this.sala_idsala = sala_idsala;
    }

    @Override
    public String toString() {
        return "LocaSala: " + "\nHorario: " + horario + "\nDia: " + dia + "\nAutorizacao: " + autorizacao + "\nAgenda_Idagenda: " + agenda_idagenda + "\nCoordenador_idcoordenador" + coordenador_idcoordenador + ", idloca_sala=" + idloca_sala + ", professor_idprofessor=" + professor_idprofessor + ", sala_idsala=" + sala_idsala + '}';
    }


    
    
    
    
    }