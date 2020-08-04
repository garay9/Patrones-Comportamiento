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
public class InsertDocument extends InsertHandler {

    public InsertDocument() {
        super();
    }

    @Override
    public boolean insertBase(String file) {
        if (file.equals("Doc")) {
            handlers.add(file);
            System.out.println(" === Se insertó documento! === ");
            return true;
        } else {
            System.out.println("* No es un documento, pasando al siguiente *");
            super.insertBase(file);
        }
        return false;
    }
}
