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
    private List<Nodo> hijos;
    private Nodo padre;
    private int indice;
    
    public Nodo(String v){
        valor = v;
        hijos = new ArrayList <>();
    }
    
    public boolean esRaiz(){
        return this.getPadre() == null;
    }
    
    public boolean esHoja(){
        return hijos.isEmpty();
    }
    
    public void agregarHijo(Nodo nodo){
        getHijos().add(nodo);
        nodo.setPadre(this);
        nodo.setIndice(hijos.size()-1);
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the hijos
     */
    public List<Nodo> getHijos() {
        return hijos;
    }

    /**
     * @return the padre
     */
    public Nodo getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }
    

    
    
}
