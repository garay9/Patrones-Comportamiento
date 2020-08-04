/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacomportamiento_equipo6;
import EJ2.SMSApp;
import EJ2.SendSMSCommand;
import EJ2.Invoker;
import EJ2.StartMusicCommand;
import EJ2.EmailApp;
import EJ2.MusicGallery;
import EJ2.SendEmailCommand;
import EJ2.OpenGalleryCommand;
import EJ2.ImageGallery;
import EJ3.Lavadora;
import EJ7.*;
/**
 *
 * @author jorge
 */
public class PracticaComportamiento_Equipo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //caso1();
        caso7();
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
    
    public static void caso3(){
        Lavadora lavadora = new Lavadora();
        lavadora.seleccionarMetodoLavado(2);
    }
    
    public static void caso7(){
        Biblioteca figueres = new Biblioteca();
        figueres.addLibro(new Libro(1,"El Quijote"));
        figueres.addLibro(new Libro(2, "Bases de datos"));
        figueres.addLibro(new Libro(4, "Patrones de diseño"));
        Estudiante george = new Estudiante("George");
        Estudiante mary = new Estudiante("Mary");
        
        figueres.suscribir(mary);
        figueres.suscribir(george);
        
        figueres.prestar("Patrones de diseño");
        
        figueres.darDeBaja(george);
        
        figueres.prestar("El Quijote");
    }
    
}
