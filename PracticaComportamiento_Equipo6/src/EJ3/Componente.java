/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

/**
 *
 * @author Danny
 */
public class Componente {
    protected Mediador mediador;
    public void setMediador(Mediador mediador){
        this.mediador = mediador;
    }
    public void terminar(){
        mediador.notify(this);
    }
}
