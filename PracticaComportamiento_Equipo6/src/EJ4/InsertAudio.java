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
public class InsertAudio extends InsertHandler {

    public InsertAudio() {
        super();
    }

    @Override
    public boolean insertBase(String file) {
        if (file.equals("Audio")) {
            db.add(file);
            System.out.println(" === Se insertó audio! === ");
            return true;
        }else {
            System.out.println("* No es un audio, pasando al siguiente *");
            super.insertBase(file);
        }
        return false;
    }
}
