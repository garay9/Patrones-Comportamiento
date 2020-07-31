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
public class SendSMSCommand implements Command{

    private Receiver smsApp;

    public SendSMSCommand(Receiver smsApp) {
        this.smsApp = smsApp;
    }
    
    @Override
    public void execute() {
        smsApp.execute();
    }
    
}
