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
 * @author danie
 */
public class Nodo {
    private String valor;
    private List<Nodo> hijos = new ArrayList <Nodo>();
    private Nodo padre;
    
    public Nodo(String v){
        valor = v;
    }
    
    public boolean esRaiz(){
        return this.padre == null;
    }
    
    public void agregarHijo(Nodo nodo){
        hijos.add(nodo);
        nodo.padre = this;
    }
    
    public List<Nodo> getHijos(){
        return hijos;
    }
    
    public String getValue(){
        return valor;
    }
    
    
}
