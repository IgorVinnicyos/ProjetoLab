/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import sun.util.calendar.LocalGregorianCalendar.Date;



/**
 *
 * @author J.Anderson
 */
public class Solicitacao {
    private Date data_solicitacao;
    private int depatarmento_iddepartamento;
    private String horario;
    private int idsolicitacao;
    private int numero_protocolo;
    private int professor_idprofessor;
    private int sala_idsala;

    public Solicitacao(Date data_solicitacao, int depatarmento_iddepartamento, String horario, int idsolicitacao, int numero_protocolo, int professor_idprofessor, int sala_idsala) {
        this.data_solicitacao = data_solicitacao;
        this.depatarmento_iddepartamento = depatarmento_iddepartamento;
        this.horario = horario;
        this.idsolicitacao = idsolicitacao;
        this.numero_protocolo = numero_protocolo;
        this.professor_idprofessor = professor_idprofessor;
        this.sala_idsala = sala_idsala;
    }

    public Date getData_solicitacao() {
        return data_solicitacao;
    }

    public void setData_solicitacao(Date data_solicitacao) {
        this.data_solicitacao = data_solicitacao;
    }

    public int getDepatarmento_iddepartamento() {
        return depatarmento_iddepartamento;
    }

    public void setDepatarmento_iddepartamento(int depatarmento_iddepartamento) {
        this.depatarmento_iddepartamento = depatarmento_iddepartamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdsolicitacao() {
        return idsolicitacao;
    }

    public void setIdsolicitacao(int idsolicitacao) {
        this.idsolicitacao = idsolicitacao;
    }

    public int getNumero_protocolo() {
        return numero_protocolo;
    }

    public void setNumero_protocolo(int numero_protocolo) {
        this.numero_protocolo = numero_protocolo;
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
        return "Solicitacao: " + "\nData_Solicitacao: " + data_solicitacao + "\nDepatarmento_IDdepartamento: " + depatarmento_iddepartamento + "\nHorario: " + horario + "\nIDsolicitacao: " + idsolicitacao + "\nNumero_Protocolo: " + numero_protocolo + "\nProfessor_IDprofessor: " + professor_idprofessor + "\nSala_IDsala: " + sala_idsala;
    }
    
    
    


}
