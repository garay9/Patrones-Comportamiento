/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacomportamiento_equipo6;
import EJ4.*;
/**
 *
 * @author jorge
 */
public class PracticaComportamiento_Equipo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        caso1();
    }
    
    public static void caso1(){
        EmailApp email = new EmailApp();
        ImageGallery images = new ImageGallery();
        MusicGallery music = new MusicGallery();
        SMSApp sms = new SMSApp();
        
        OpenGalleryCommand openG = new OpenGalleryCommand(images);
        SendEmailCommand emailS = new SendEmailCommand(email);
        StartMusicCommand musicP = new StartMusicCommand(music);
        SendSMSCommand smsS = new SendSMSCommand(sms);
        
        Invoker invoker = new Invoker();
        
        invoker.setCommand(openG);
        invoker.Invoke();
        
        invoker.setCommand(emailS);
        invoker.Invoke();

        invoker.setCommand(musicP);
        invoker.Invoke();
        
        invoker.setCommand(smsS);
        invoker.Invoke();
    }
    
}
