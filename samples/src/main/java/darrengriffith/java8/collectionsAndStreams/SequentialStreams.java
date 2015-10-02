/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.collectionsAndStreams;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author darrengriffith
 */
public class SequentialStreams {

    List<Person> list = new LinkedList<>();

    public class Person {

        public String name;
        public int age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }
    }

    public SequentialStreams() {

        list.add(new Person("John", 43));
        list.add(new Person("Jane", 20));
        list.add(new Person("Joe", 34));
        list.add(new Person("Judy", 18));
    }
    
    public void execute() {
        
        Predicate<Person> under21 = (Person t) -> ((Person)t).age <= 20;     
        
        list.stream()
                .filter(under21)
                .forEach(p -> System.out.println(p.name + " (" + Integer.toString(p.age) + ")"));
    }
}
