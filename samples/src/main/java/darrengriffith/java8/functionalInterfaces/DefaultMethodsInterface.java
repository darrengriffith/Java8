/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.functionalInterfaces;

/**
 *
 * @author darrengriffith
 */
public interface DefaultMethodsInterface {

    // Abstract interface methods
    String getString();
    void setString(String str);
    
    // Default implementation method
    default void print() {
        System.out.println(getString());
    }
    
    static void printStatic() {
        System.out.println("Using Default Static Method");
    }
}
