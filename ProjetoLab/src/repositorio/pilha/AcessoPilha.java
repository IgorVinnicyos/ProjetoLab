/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.pilha;

import java.util.*;
import classes.Acesso;

/**
 *
 * @author igor_
 */
public class AcessoPilha {
    
    static Stack acesso = new Stack();
     public static void acessoPilha(Acesso a ){
 
 acesso.push(a);
 
 }
    
     public static Acesso tirarAcesso(){
 
 Acesso a = (Acesso)acesso.pop();
 return a;
 }
 
}
