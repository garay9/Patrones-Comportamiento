/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1;

import javax.script.ScriptEngineManager;

/**
 *
 * @author josed
 */
public class Memento {
    private double x;
    private double y;
    private double z;
    
    Memento(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
       
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    
}
