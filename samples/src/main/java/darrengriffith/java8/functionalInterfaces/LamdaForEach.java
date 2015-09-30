/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.functionalInterfaces;

import java.util.ArrayList;

/**
 *
 * @author dgriffith
 */
public class LamdaForEach {

    ArrayList<String> list = new ArrayList<>();

    public LamdaForEach() {

        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.add("s5");
    }

    public void executeFor() {

        for (String str : list) {
            System.out.println("For: " + str);
        }
    }

    public void executeForEach() {

        list.forEach(str -> System.out.println("For Each: " + str));
    }
}
