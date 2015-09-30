/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.functionalInterfaces;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dgriffith
 */
public class InnerClassVsLamda {

    public static void executeInnerClass() {

        try {
            Runnable r1 = new Runnable() {

                @Override
                public void run() {

                    System.out.println("Runnable via inner class");
                }
            };

            Thread t1 = new Thread(r1);
            t1.start();
            t1.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(InnerClassVsLamda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void executeLamda() {
        
        try {
            Runnable r2 = () -> System.out.println("Runnable via lamda function");
            
            Thread t2 = new Thread(r2);
            t2.start();
            t2.join();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(InnerClassVsLamda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
