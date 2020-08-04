/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ7;


/**
 *
 * @author jorge
 */
public class Estudiante implements Suscriptor{

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void update(Libro libro) {
        System.out.println("Notificando a " + getNombre() + ":");
        if(libro.getCantidad() <= 0){
            System.out.println("No quedan ejemplares de "+libro.getTitulo());
        }else{
            System.out.println("Quedan "+ String.valueOf(libro.getCantidad()) + 
                " ejemplares de " + libro.getTitulo());
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
