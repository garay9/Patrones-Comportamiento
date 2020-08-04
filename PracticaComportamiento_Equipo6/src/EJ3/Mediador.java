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
public interface Mediador {
    public void notify(Componente sender); 
    public void setPeso(int peso);
}
