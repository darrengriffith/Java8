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
public class DefaultMethods implements DefaultMethodsInterface {

    private String str;

    @Override
    public String getString() {
        return str;
    }

    @Override
    public void setString(String str) {
        this.str = str;
    }

    public void execute() {
        setString("Using Default Interface Method");

        print();

        DefaultMethodsInterface.printStatic();
    }
}
