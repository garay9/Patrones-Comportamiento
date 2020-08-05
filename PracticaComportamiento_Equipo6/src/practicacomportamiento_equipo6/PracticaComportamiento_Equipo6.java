/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacomportamiento_equipo6;
import EJ1.Calculadora;
import EJ1.CareTaker;
import EJ4.*;
import EJ8.Contexto;
import EJ8.From;
import EJ8.SQLStatement;
import EJ8.Select;
import EJ8.Where;
import javax.script.ScriptException;
/**
 *
 * @author jorge
 */
public class PracticaComportamiento_Equipo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ScriptException {
        caso8();
    }
    
    public static void caso2(){
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
    
    public static void caso1() throws ScriptException{
        Calculadora calculadora = new Calculadora(2.0, 3.0, 4.0);
        System.out.println(calculadora.operarX("+", 5));
        
        System.out.println(calculadora.operacionBasica(3, "*", 5));
        
        System.out.println(calculadora.raiz(4));
        
        CareTaker careTaker = new CareTaker();
        careTaker.setCheckpoint(calculadora.guardarEstado(calculadora));
        
        System.out.println("CAMBIANDO VALORES");
        calculadora.setX(2);
        calculadora.setY(2);
        
        System.out.println(calculadora.operarZ("+",
                calculadora.operarY("+", 
                calculadora.getX())));
        
        System.out.println("DEVOLVIENDO A ESTADO ORIGINAL");
        
        calculadora.reestablecer(careTaker.getCheckpoint());
        
        System.out.println(calculadora.operarZ("+",
                calculadora.operarY("+", 
                calculadora.getX())));
        
        
        
        
        
    }
    
    public static void caso8(){
             /*
                    SELECT name FROM Client WHERE name = (SELECT name FROM People
                */
	        SQLStatement query = new Select("name", new From("Client", 
                        new Where("name =", new Select("name", new From("People")))));
	        Contexto ctx = new Contexto();
                System.out.println("MOSTRANDO GRAMÁTICA");
                System.out.println("*************************");
                System.out.println(query.interpret(ctx));
                
                System.out.println("MOSTRANDO ARBOL");
                System.out.println("*************************");
	        
                ctx.printTree();
    }
    
    
    
    
}
