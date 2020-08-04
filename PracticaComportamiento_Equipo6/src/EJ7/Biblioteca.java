/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ7;

import java.util.ArrayList;


/**
 *
 * @author jorge
 */
public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Suscriptor> suscriptores;

    public Biblioteca() {
        libros = new ArrayList();
        suscriptores = new ArrayList();
    }
    
    public void suscribir(Suscriptor s){
        if(!suscriptores.contains(s)){
            suscriptores.add(s);
        }else{
            System.out.println("El suscriptor ya está suscrito");
        }
    }
    
    public void darDeBaja(Suscriptor s){
        if(suscriptores.contains(s)){
            suscriptores.remove(s);
        }else{
            System.out.println("Suscriptor no encontrado");
        }
    }
    
    public void notificar(Libro libro){
        suscriptores.forEach(s -> {
            s.update(libro);
        });
    }
    
    public boolean prestar(String titulo){
        for(Libro l : libros){
            if(l.getTitulo().equals(titulo)){
                if(l.getCantidad() > 0){
                    System.out.println("Se prestó el libro: " + titulo);
                    l.setCantidad(l.getCantidad()-1);
                    notificar(l);
                    return true;
                }else{
                    System.out.println("El libro no está disponible");
                    return false;
                }
            }
        }
        System.out.println("Libro no encontrado");
        return false;
    }
    
    public void addLibro(Libro l){
        libros.add(l);
    }
        
}
