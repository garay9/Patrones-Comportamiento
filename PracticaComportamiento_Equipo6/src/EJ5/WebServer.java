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
public class WebServer extends Server {

    public WebServer() {

    }

    @Override
    public void ejecutar() {
        hibernar();
        respaldar();
        autoapagar();
    }

    @Override
    public void respaldar() {
        System.out.println("> Respaldando WebServer");
    }

    @Override
    public void autoapagar() {
        System.out.println("> El WebServer se autoapagará");
    }

    @Override
    public void hibernar() {
        System.out.println("> El WebServer hibernará");
    }

}
