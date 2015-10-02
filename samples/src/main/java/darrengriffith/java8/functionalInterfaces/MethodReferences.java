/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darrengriffith.java8.functionalInterfaces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author dgriffith
 */
public class MethodReferences {

    List<Person> list = new LinkedList<>();

    public static class Person {

        public String name;
        public int age;

        public Person(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public static int compareAges(Person p1, Person p2) {
            Integer age1 = p1.age;
            Integer age2 = p2.age;

            return age1.compareTo(age2);
        }
    }

    public MethodReferences() {

        list.add(new Person("John", 43));
        list.add(new Person("Jane", 20));
        list.add(new Person("Joe", 34));
        list.add(new Person("Judy", 18));
    }

    private int compareAgesInstance(Person p1, Person p2) {
        Integer age1 = p1.age;
        Integer age2 = p2.age;

        return age1.compareTo(age2);
    }

    public void staticMethodReference() {

        Collections.sort(list, Person::compareAges);
        list.forEach(p -> System.out.println("Static: " + p.name + " : " + Integer.toString(p.age)));
    }

    public void execute() {

        // Static Method Reference
        staticMethodReference();

        // Instance Method Reference
        Collections.sort(list, this::compareAgesInstance);
        list.forEach(p -> System.out.println("Instance: " + p.name + " : " + Integer.toString(p.age)));

    }
}
