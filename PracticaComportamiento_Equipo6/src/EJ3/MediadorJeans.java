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
public class MediadorJeans implements Mediador{
    private Tambor tambor;
    private Motor motor;
    private ValvulaAgua valvulaAgua;
    private ValvulaJabon valvulaJabon;
    private ValvulaSuavizante valvulaSuavizante;
    private Escotilla escotilla;
    private int pesoRopa;
    private Calentador calentador;
    
    public MediadorJeans(Tambor tambor, ValvulaAgua valvulaAgua, Calentador calentador, ValvulaJabon valvulaJabon, ValvulaSuavizante valvulaSuavizante,  Motor motor, Escotilla escotilla){
        this.tambor = tambor;
        this.valvulaAgua = valvulaAgua;
        this.calentador = calentador;
        this.valvulaJabon = valvulaJabon;
        this.valvulaSuavizante = valvulaSuavizante;
        this.motor = motor;
        this.escotilla = escotilla;
    }
    
    @Override
    public void notify(Componente sender){      
        if (sender instanceof Tambor){
            valvulaAgua.verterAgua(pesoRopa);
            valvulaAgua.terminar();
        }else if (sender instanceof ValvulaAgua){
            calentador.setTemperatura(30);
            calentador.terminar();
        }else if (sender instanceof Calentador){
            valvulaJabon.verterJabon(pesoRopa);
            valvulaJabon.terminar();
        }else if (sender instanceof ValvulaJabon){
            valvulaSuavizante.verterSuavizante(pesoRopa);
            valvulaSuavizante.terminar();
        }else if (sender instanceof ValvulaSuavizante){
            motor.mover();
            motor.terminar();     
        }else if (sender instanceof Motor){
            escotilla.vaciarAgua();
            escotilla.terminar();
        }else if (sender instanceof Escotilla){
            System.out.println("La ropa se ha lavado");
        }
    } 
    @Override
    public void setPeso(int peso){
        pesoRopa = peso;
    }
}
