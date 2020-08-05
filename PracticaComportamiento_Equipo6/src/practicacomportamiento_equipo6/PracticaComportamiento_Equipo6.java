/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacomportamiento_equipo6;
import EJ1.Calculadora;
import EJ1.*;
import EJ2.*;
import EJ3.Lavadora;
import EJ4.*;
import EJ6.*;
import EJ7.*;
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
        caso1();
        //caso2();
        //caso3();
        //caso4();
        //caso6();
        //caso7();
        //caso8();
    }
    
    public static void caso1() throws ScriptException{
        Calculadora calculadora = new Calculadora(2, 3, 4);
        System.out.println("VALORES X = 2, Y = 3, Z = 4");
       CareTaker careTaker = new CareTaker();
  
        System.out.println("CREANDO RESPALDO");
        Memento memento = new Memento(calculadora.getX(), calculadora.getY(), calculadora.getZ());
        careTaker.setCheckpoint(memento);
        
        System.out.println("RESULTADO ESPERADO: X+ Y = 5");
        System.out.println(calculadora.operarX("+", calculadora.getY()));
        
        
        System.out.println("ASIGNANDO LOS VALORES X=1 Y=2 = Y= 3");
        calculadora.setX(1);
        calculadora.setY(2);
        calculadora.setZ(3);
        
        System.out.println("OPERACIÓN X+Y+Z = 6");
        System.out.println(calculadora.operarX("+", calculadora.operarY("+", calculadora.getZ())));
        
        System.out.println("RESTABLECIENDO A PUNTO ANTERIOR");
        calculadora.restablecer(careTaker.getCheckpoint());
        System.out.println(memento.getX());
        System.out.println("RESULTADO ESPERADO: X+ Y = 5");
        System.out.println(calculadora.operarX("+", calculadora.getY()));
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
    
    public static void caso3(){
        Lavadora lavadora = new Lavadora();
        lavadora.seleccionarMetodoLavado(2);
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
    
    public static void caso6(){
        Nodo raiz = new Nodo("PPC");
        Nodo nodo1 = new Nodo("Marketing");
        Nodo nodo2 = new Nodo("Finanzas");
        Nodo nodo3 = new Nodo("Garay");
        Nodo nodo4 = new Nodo("George");
        Nodo nodo5 = new Nodo("Mary");
        Nodo nodo6 = new Nodo("Danny");       
        
        raiz.agregarHijo(nodo1);
        raiz.agregarHijo(nodo2);
        nodo1.agregarHijo(nodo3);
        nodo1.agregarHijo(nodo4);
        nodo1.agregarHijo(nodo5);
        nodo2.agregarHijo(nodo6);
        
        
        RegistroEmpleados registro = new RegistroEmpleados(); 
        IteradorEmpleado iterador = registro.getIterador(raiz);
        while(iterador.hasNext()){
            Nodo n = (Nodo)iterador.next();
            System.out.println(n.getValor());
        }
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
    public static void caso8(){
        
        System.out.println("LA CONSULTA ES:"
                + "SELECT name from Cliente Where name = (SELECT name from People)");
        SQLStatement query = new Select("name", new From("Cliente",
            new Where("name = ", new Select("name", 
            new From("People")))));
        
        Contexto ctx = new Contexto();
        System.out.println("*********************");
        System.out.println("PROCESO DE SINTÁCTICO");
        System.out.println(query.interpret(ctx));
        
        System.out.println("*********************");
        System.out.println("ÁRBOL DE PARSER");
        ctx.printTree();
    }
    
    
}
