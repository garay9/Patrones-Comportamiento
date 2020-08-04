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
            return true;
        }else {
            super.insertBase(file);
        }
        return false;
    }
}
