/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6;
/**
 *
 * @author Danny
 */
public class RegistroEmpleados implements Registro{

    @Override
    public IteradorEmpleado getIterador(Nodo raiz) {
        return new IteradorEmpleado(raiz);
    }
    
}
