/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ5;

/**
 *
 * @author Maruchan
 */
public class DataCenter extends Server {

    public DataCenter() {

    }

    @Override
    public void ejecutar() {
        respaldar();
        hibernar();
        autoapagar();
    }

    @Override
    public void respaldar() {
        System.out.println("> Respaldando DataCenter");
    }

    @Override
    public void autoapagar() {
        System.out.println("> El DataCenter se autoapagará");
    }

    @Override
    public void hibernar() {
        System.out.println("> El DataCenter hibernará");
    }

}
