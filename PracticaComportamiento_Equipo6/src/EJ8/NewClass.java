/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.List;

/**
 *
 * @author jorge
 */
public class NewClass {
     public static void main(String[] args) {
	 
	        SQLStatement query = new Select("name", new From("people"));
	        Contexto ctx = new Contexto();
	        System.out.println(query.interpret(ctx));
	       
	    }
}
