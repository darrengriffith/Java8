/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.javaScript;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author darrengriffith
 */
public class JavaScript {

    public static void main(String[] args) {

        try {
            System.out.println("\n---  JavaScript  ---\n");

            //
            // Simple JS
            //
            System.out.println("\n~~ Script Engines ~~");

            ScriptEngineManager sem = new ScriptEngineManager();
            
            List<ScriptEngineFactory> f = sem.getEngineFactories();
            f.forEach(sef -> System.out.println(sef.getEngineName()));

            //
            // Simple JS
            //
            System.out.println("\n~~ Simple JavaScript ~~");

            ScriptEngine se = sem.getEngineByName("nashorn");

            String jsCode = "var str = 'Running the Nashorn Engine';"
                    + "str";

            Object result = se.eval(jsCode);

            System.out.println(result);

            //
            // Calling Java from JavaScript
            //
            System.out.println("\n~~ Calling Java from JavaScript ~~");
            
            jsCode = "var input = new java.util.Scanner(new java.net.URL('http://services.explorecalifornia.org/rss/tours.php').openStream());"
                    + "input.useDelimiter('<item>');"
                    + "var contents = input.next();"
                    + "contents = input.next();"
                    + "contents";
            
            result = se.eval(jsCode);
            
            System.out.println(result);
            
        } catch (ScriptException ex) {
            Logger.getLogger(JavaScript.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
