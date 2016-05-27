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
public class Local {
    private String andar;
    private String bloco;
    private String codigo;
    private int idlocal;
    private boolean status;

    public Local(String andar, String bloco, String codigo,boolean status) {
        this.andar = andar;
        this.bloco = bloco;
        this.codigo = codigo;
        this.status = status;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }

    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    @Override
    public String toString() {
        return "Local: " + "\nAndar: " + andar + "\nBloco: " + bloco + "\nCodigo: " + codigo + "\nIDlocal: " + idlocal + "\nStatus: " + status;
    }

    
    
    
    
    
    
}
