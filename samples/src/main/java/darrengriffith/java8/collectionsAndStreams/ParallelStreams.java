/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.collectionsAndStreams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author darrengriffith
 */
public class ParallelStreams {

    List<Person> list = new LinkedList<>();

    public class Person {

        public String name;
        public int age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }
    }

    public ParallelStreams() {

        list.add(new Person("John", 43));
        list.add(new Person("Jane", 20));
        list.add(new Person("Joe", 34));
        list.add(new Person("Judy", 18));
    }

    private String getSpaces(int i) {
        String spaces = "";
        
        for(int j = 0; j < i / 10; j++) {
            spaces += " ";
        }
        
        return spaces;
    }
    
    public void execute() {

        Predicate<Person> under21 = (Person t) -> ((Person) t).age <= 20;

        list.parallelStream()
                .filter(under21)
                .forEach(p -> System.out.println(p.name + " (" + Integer.toString(p.age) + ")"));


        System.out.println("\nVisualizing the parallel processing:");
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            strings.add("Item " + getSpaces(i) + i);
        }

        strings.parallelStream()
                .forEach(str -> System.out.println(str));

        System.out.println("Notice how the items were printed in blocks");
        System.out.append("The stream was broken into block and each blocks was executed in a seperate thread\n");
    }
}
