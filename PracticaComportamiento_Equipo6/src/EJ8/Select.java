/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.List;
import java.util.Map;

/**
 *
 * @author josed
 */
public class Select implements SQLStatement{
    
     private String column;
    private From from;
    
    public Select(String column, From from){
        this.column = column;
        this.from = from;
    }

    @Override
     public String interpret(Contexto contexto){
         contexto.match("SELECT");
         contexto.match("<"+column+">");
         return "SELECT::= "+column+" "+from.interpret(contexto);
     }
     
}
