/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class Lavadora {
    private Mediador metodoLavado;
    String respuesta;
    Scanner entradaEscaner = new Scanner (System.in);
    
    public void seleccionarMetodoLavado(int seleccion){
        Tambor tambor = new Tambor();
        ValvulaAgua valvulaAgua = new ValvulaAgua();
        Calentador calentador = new Calentador();
        ValvulaJabon valvulaJabon = new ValvulaJabon();
        ValvulaSuavizante valvulaSuavizante = new ValvulaSuavizante();
        Motor motor = new Motor();               
        Escotilla escotilla = new Escotilla();
        int prendas;
        switch (seleccion) {
            case 1:  
                metodoLavado = new MediadorJeans(tambor, valvulaAgua, calentador, valvulaJabon, valvulaSuavizante, motor, escotilla); 

                tambor.setMediador(metodoLavado);
                valvulaAgua.setMediador(metodoLavado);
                valvulaJabon.setMediador(metodoLavado);
                valvulaSuavizante.setMediador(metodoLavado);
                escotilla.setMediador(metodoLavado);
                calentador.setMediador(metodoLavado);   
                motor.setMediador(metodoLavado);
                
                System.out.println("Ingrese la cantidad de prendas a lavar: ");
                respuesta = entradaEscaner.nextLine(); 
                prendas = Integer.parseInt(respuesta);
                metodoLavado.setPeso(prendas);
                tambor.terminar();
                break;
                
            case 2:        
                metodoLavado = new MediadorAlgodon(tambor, valvulaAgua, valvulaJabon, valvulaSuavizante, motor, escotilla); 
                               
                tambor.setMediador(metodoLavado);
                valvulaAgua.setMediador(metodoLavado);
                valvulaJabon.setMediador(metodoLavado);
                valvulaSuavizante.setMediador(metodoLavado);
                escotilla.setMediador(metodoLavado);
                calentador.setMediador(metodoLavado);   
                motor.setMediador(metodoLavado);
                
                System.out.println("Ingrese la cantidad de prendas a lavar: ");
                respuesta = entradaEscaner.nextLine(); 
                prendas = Integer.parseInt(respuesta);
                metodoLavado.setPeso(prendas);
                tambor.terminar();
                break;
            case 3:
                metodoLavado = new MediadorSeda(tambor, valvulaAgua, valvulaJabon, valvulaSuavizante, motor, escotilla); 
                               
                tambor.setMediador(metodoLavado);
                valvulaAgua.setMediador(metodoLavado);
                valvulaJabon.setMediador(metodoLavado);
                valvulaSuavizante.setMediador(metodoLavado);
                escotilla.setMediador(metodoLavado);
                calentador.setMediador(metodoLavado);   
                motor.setMediador(metodoLavado);
                
                System.out.println("Ingrese la cantidad de prendas a lavar: ");
                respuesta = entradaEscaner.nextLine(); 
                prendas = Integer.parseInt(respuesta);
                metodoLavado.setPeso(prendas);
                tambor.terminar();
                break;
            default:
                break;
        }        
    }  
}

