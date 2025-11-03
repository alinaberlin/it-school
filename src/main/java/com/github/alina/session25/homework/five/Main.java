package com.github.alina.session25.homework.five;
//class Person {
//    String firstName;
//    String lastName;
//    int age;
//}
//List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
        var personList= people.stream().filter(p->p.getAge()>18).toList();
        System.out.println(personList);
    }
}
