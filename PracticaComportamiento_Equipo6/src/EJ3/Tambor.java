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
public class Tambor extends Componente {  
    private int peso;
    
    public int calcularPeso(int prendas){
        peso = prendas * 100;
        System.out.println("Hay " + peso + " gramos");
        return peso;
    }
    
    
}
