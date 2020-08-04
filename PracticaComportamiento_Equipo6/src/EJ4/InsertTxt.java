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
public class InsertTxt extends InsertHandler {

    public InsertTxt() {
        super();
    }

    @Override
    public boolean insertBase(String file) {
        if (file.equals("Txt")) {
            handlers.add(file);
            System.out.println(" === Se insertó documento de texto! === ");
            return true;
        } else {
            System.out.println("* No es un documento de texto, pasando al siguiente *");
            super.insertBase(file);
        }
        return false;
    }
    
}
