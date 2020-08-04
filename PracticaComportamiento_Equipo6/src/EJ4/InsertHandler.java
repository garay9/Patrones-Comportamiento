/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

import java.util.ArrayList;

/**
 *
 * @author Maruchan
 */
public class InsertHandler implements Handler {

    private Handler next;
    public ArrayList<String> handlers;

    public Handler getNext() {
        return next;
    }

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public boolean insertBase(String file) {
        if(next != null){
            next.insertBase(file);
            return true;
        }
        return false;
    }

}
