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
public interface Handler {
    
    public void setNext(Handler h);
    public boolean insertBase(String file);
    
}
