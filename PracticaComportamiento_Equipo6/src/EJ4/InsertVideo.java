/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

/**
 *
 * @author Maruchan
 */
public class InsertVideo extends InsertHandler {

    public InsertVideo() {
        super();
    }
    

    @Override
    public boolean insertBase(String file) {
        if (file.equals("Video")) {
            handlers.add(file);
            System.out.println(" === Se insertó video! === ");
            return true;
        }else {
            System.out.println("* No es un video, pasando al siguiente *");
            super.insertBase(file);
        }
        return false;
    }
}
