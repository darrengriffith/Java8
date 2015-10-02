/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.collectionsAndStreams;

import java.util.stream.Stream;

/**
 *
 * @author darrengriffith
 */
public class CollectionsFromArrays {

    public class Person {

        public String name;
        public int age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }
    }

    public CollectionsFromArrays() {

    }

    public void execute() {
        
        Person[] array = {
            new Person("John", 43),
            new Person("Jane", 20),
            new Person("Joe", 34),
            new Person("Judy", 18)
        };
        
        Stream<Person> stream = Stream.of(array);
        stream.forEach(p -> System.out.println(p.name));
    }
}
