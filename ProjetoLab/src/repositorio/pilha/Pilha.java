/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.pilha;

import java.util.Stack;
import classes.*;

/**
 *
 * @author igor_
 */
public class Pilha {
 
 static Stack pilha = new Stack(); 
 
 public static void coordenadorPilha(Coordenador c ){
 
 pilha.push(c);
 
 }
  
  public static void professorPilha(Professor p ){
 
 pilha.push(p);
 
 }
 
  
   public static void departamentoPilha(Departamento d ){
 
 pilha.push(d);
 
 }
   
 public static void tiPilha(Funcionario f ){
 
 pilha.push(f);
 
 }  
 public static Coordenador tirarCoordenador(){
 
 Coordenador c = (Coordenador)pilha.pop();
 return c;
 }
 
 public static Professor tirarProfessor(){
 
 Professor p = (Professor)pilha.pop();
 return p;
 }
 
 public static Departamento tirarDepartamento(){
 
 Departamento d = (Departamento)pilha.pop();
 return d;
 }
 public static Funcionario tirarFuncionario(){
 
 Funcionario f = (Funcionario)pilha.pop();
 return f;
 }

}
