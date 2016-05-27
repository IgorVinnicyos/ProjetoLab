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
    
    private String horario;
    private Date dia;
    private boolean autorizacao;
    private int agenda_idagenda;
    private int coordenador_idcoordenador;
    private int idloca_sala;
    private int professor_idprofessor;
    private int sala_idsala;
    private boolean status;

    public LocaSala(String horario, Date dia, boolean autorizacao, int agenda_idagenda, int coordenador_idcoordenador,int professor_idprofessor, int sala_idsala,boolean status) {
        this.horario = horario;
        this.dia = dia;
        this.autorizacao = autorizacao;
        this.agenda_idagenda = agenda_idagenda;
        this.coordenador_idcoordenador = coordenador_idcoordenador;
        this.professor_idprofessor = professor_idprofessor;
        this.sala_idsala = sala_idsala;
        this.status = status;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public boolean getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(boolean autorizacao) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LocaSala: " + "\nHorario: " + horario + "\nDia: " + dia + "\nAutorizacao: " + autorizacao + "\nAgenda_Idagenda: " + agenda_idagenda + "\nCoordenador_idcoordenador" + coordenador_idcoordenador + ", idloca_sala=" + idloca_sala + ", professor_idprofessor=" + professor_idprofessor + ", sala_idsala=" + sala_idsala + "\nStatus: " + status;
    }


    
    
    
    
    }