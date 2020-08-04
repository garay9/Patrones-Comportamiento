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
import EJ4.*;
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
        //caso2();
        caso4();
        //caso7();

    }

    public static void caso2() {
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

    public static void caso4() {
        Handler h1 = new InsertDocument();
        Handler h2 = new InsertAudio();
        Handler h3 = new InsertImg();
        Handler h4 = new InsertTxt();
        Handler h5 = new InsertVideo();

        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        h4.setNext(h5);

        System.out.println("> Ingresando imagen");
        h1.insertBase("Img");
        
        System.out.println("\n=============================================\n");
        
        System.out.println("> Ingresando video");
        h1.insertBase("Video");

    }

    public static void caso7() {
        Biblioteca figueres = new Biblioteca();
        figueres.addLibro(new Libro(1, "El Quijote"));
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
