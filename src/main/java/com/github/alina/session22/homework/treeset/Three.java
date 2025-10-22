package com.github.alina.session22.homework.treeset;
//3. Write a Java program to add all
// the elements of a specified tree set to another tree set.

import java.util.TreeSet;

public class Three {
public static void main(String[] args) {
    TreeSet<Integer> set1 =new TreeSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(3);
    set1.add(4);
    System.out.println("set1" + set1);
    TreeSet<Integer> set2 =new TreeSet<>();
    set2.add(5);
    set2.add(6);
    set2.add(7);
    System.out.println("set2" + set2);
    set2.addAll(set1);
    System.out.println("added elements" + set2);
}
}
