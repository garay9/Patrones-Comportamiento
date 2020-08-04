/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danny
 */

public class IteradorEmpleado implements Iterador {
    
    @Override
    public Object next(){
       return null;
    }

    @Override
    public boolean hasNext() {
//        if (nodoRaiz.getHijos().isEmpty()){
//            return False;
//        }
       return true;
    }  
    
    public void recorrerArbol(Nodo nodoRaiz) {
        if (nodoRaiz.getHijos().isEmpty()) {
        System.out.println(nodoRaiz.getValue());       
    }
        for (final Nodo nodo : nodoRaiz.getHijos()) {
       recorrerArbol(nodo);
    }
}
}
