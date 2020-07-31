/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;


/**
 *
 * @author jorge
 */
public class OpenGalleryCommand implements Command{

    private Receiver galeria;

    public OpenGalleryCommand(Receiver receiver) {
        this.galeria = receiver;
    }
    
    @Override
    public void execute() {
        galeria.execute();
    }
    
}
