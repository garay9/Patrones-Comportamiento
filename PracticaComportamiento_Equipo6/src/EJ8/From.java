/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josed
 */
public class From implements SQLStatement {
    
    private String table;
    private Where where;
    

    
    From(String table){
        this.table = table;

    }
    
    From(String table, Where where){
        this.table = table;
        this.where = where;

    }
    
    @Override
        
    public String interpret(Contexto contexto) {
	contexto.setTable(table);
        
	if (where == null) {
            
            return contexto.search();
          
        }
	return where.interpret(contexto);
    }
   
}
