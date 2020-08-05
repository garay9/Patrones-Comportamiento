/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author josed
 */
public class Where implements SQLStatement{
    private String condition;
    private SQLStatement statement;
    
    public Where(String condition){
        this.condition = condition;
    }
    
    public Where(String condition, SQLStatement statement){
        this.statement = statement;
        this.condition = condition;

    }
    
    public Where(SQLStatement statement){
        this.statement = statement;

    }
     
    @Override
    public String interpret(Contexto contexto) {
        if(statement != null && condition != null){
            contexto.match("WHERE");
            return "(WHERE "+condition+" "+statement.interpret(contexto)+")";
        }else if(statement != null){
            contexto.match("WHERE");
            return "(WHERE "+statement.interpret(contexto)+")";
        }
        contexto.match("WHERE");
        contexto.match("<"+condition+">");
        return "WHERE "+condition;
    }
    
    
}
