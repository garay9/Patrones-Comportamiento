/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ2;


/**
 *
 * @author jorge
 */
public class Invoker {
    private Command command;

    public Invoker() {
    }
    
    public void setCommand(Command command){
        this.command = command;
    }
    
    public void Invoke(){
        command.execute();
    }
}
