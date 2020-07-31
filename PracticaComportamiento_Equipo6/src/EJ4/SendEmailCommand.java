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
public class SendEmailCommand implements Command{

    private Receiver emailApp;

    public SendEmailCommand(Receiver emailApp) {
        this.emailApp = emailApp;        
    }
        
    @Override
    public void execute() {
        emailApp.execute();
    }
    
}
