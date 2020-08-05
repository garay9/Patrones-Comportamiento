/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.tree.TreeModel;

/**
 *
 * @author josed
 */
public class Contexto {

    private List<String> arbol;
    
    public Contexto(){
        arbol = new LinkedList<>();
    }
    
   public void match(String expresion){
        arbol.add(expresion);
   }
   
   public void printTree(){
       for(String expresion : arbol){
           System.out.println(expresion);
       }
   }
	   
}
