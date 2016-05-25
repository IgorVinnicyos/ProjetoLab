/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolab;
import conexao.Conecta;
import java.sql.*;
import repositorio.*;
import classes.*;
/**
 *
 * @author 151091797
 */
public class ProjetoLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conecta conexao = new Conecta();
        
       Connection con = conexao.Conecta();
        
        System.out.println(con);
        
        Coordenador coordenador = new Coordenador("Rodrigo","diurno",5000,true);
        
       repositorio.Inserir.inserirCoordenador(coordenador, con);
       
       
        
        
    }
    
}
