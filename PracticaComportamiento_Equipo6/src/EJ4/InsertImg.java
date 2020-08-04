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
public class InsertImg extends InsertHandler {

    public InsertImg() {
        super();
    }
        
    @Override
    public boolean insertBase(String file) {
        if (file.equals("Img")) {
            handlers.add(file);
            System.out.println(" === Se insertó imagen! === ");
            return true;
        }else {
            System.out.println("* No es una imagen, pasando al siguiente *");
            super.insertBase(file);
        }
        return false;
    }
}
