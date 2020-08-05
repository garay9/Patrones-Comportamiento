/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author josed
 */
public class Calculadora {
    private double x;
    private double y;
    private double z;
    private ScriptEngineManager manager;
    private ScriptEngine engine;
    
    public Calculadora(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        manager = new ScriptEngineManager();
        engine = manager.getEngineByName("js");
        
    }
    
    public Calculadora(){
        this.x = 0;
        this.y =0;
        this.z = 0;
        manager = new ScriptEngineManager();
        engine = manager.getEngineByName("js");
        
    }
    
    public double operacionBasica(double x, String operador, double y) throws ScriptException{
        this.x = x;
        this.y = y;
        String operacion = x+operador+y;
        System.out.println("Realizando la operación: "+operacion);
        return (double) engine.eval(x+operador+y);
    }

    public double raiz(double x){
        this.x = x;
        System.out.println("Raiz de "+x);
        return Math.sqrt(x);
    }
    
    public double operarX(String operador, double value) throws ScriptException{
        System.out.println("Operación: "+x+operador+value);
        this.x = (double) engine.eval(x+operador+value);
        return x;
    }
    
    public double operarY(String operador, double value) throws ScriptException{
        System.out.println("Operación: "+x+operador+value);
        this.y = (double) engine.eval(y+operador+value);
        return y;
    }
    
    public double operarZ(String operador, double value) throws ScriptException{
        System.out.println("Operación: "+x+operador+value);
        this.z = (double) engine.eval(z+operador+value);
        return z;
    }

    public Memento guardarEstado(Calculadora calculadora){
        return new Memento(calculadora.getX(), calculadora.getY(), calculadora.getZ());
    }
    
    public void restablecer(Memento memento){
        this.x = memento.getX();
        this.y = memento.getY();
        this.z = memento.getZ();
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
