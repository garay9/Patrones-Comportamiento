/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1;

/**
 *
 * @author josed
 */
public class CareTaker {
    
    private Memento checkpoint;
    private Calculadora calculadora;

    public Memento getCheckpoint() {
        return checkpoint;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCheckpoint(Memento checkpoint) {
        this.checkpoint = checkpoint;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
    
    
}
