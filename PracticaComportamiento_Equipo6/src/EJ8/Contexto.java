/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author josed
 */
public class Contexto {
    private static Map<String, List<Row>> tables = new HashMap<>();
    private String table;
    private String Column;
	 
	    static {
	        List<Row> list = new ArrayList<>();
	        list.add(new Row("Garay", "Feliz"));
	        tables.put("people", list);
	    }

    public Map<String, List<Row>> getTables() {
        return tables;
    }

    public static void setTables(Map<String, List<Row>> tables) {
        Contexto.tables = tables;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumn(String Column) {
        this.Column = Column;
    }
    
    public String search(){
       
    }
	 
	   
}
