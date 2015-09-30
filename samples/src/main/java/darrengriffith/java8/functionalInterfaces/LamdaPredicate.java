/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.functionalInterfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author dgriffith
 */
public class LamdaPredicate {

    List<Person> list = new LinkedList<>();

    public class Person {

        public String name;
        public int    age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }
    }

    public LamdaPredicate() {

        list.add(new Person("John", 43));
        list.add(new Person("Jane", 20));
        list.add(new Person("Joe", 34));
        list.add(new Person("Judy", 18));
    }

    public void executeInnerClass() {

        Predicate<Person> under21 = new Predicate() {

            @Override
            public boolean test(Object t) {
                return ((Person)t).age <= 20;
            }
        };
        
        System.out.println("Under 21:");
        list.forEach(person -> {
            if(under21.test(person)) {
                System.out.println("- " + person.name + " (" + person.age + ")");
            }
        });
    }

    private void displayPeople(Predicate<Person> pred) {
        
        list.forEach(person -> {
            if(pred.test(person)) {
                System.out.println("- " + person.name + " (" + person.age + ")");
            }
        });    
    }

    public void executeLamda() {
        
        Predicate<Person> under21 = (person) -> person.age < 21;
        Predicate<Person> over20 = (person) -> person.age > 20;
        
        System.out.println("Under 21:");
        displayPeople(under21);
        
        System.out.println("Over 20:");
        displayPeople(over20);
    }
}
