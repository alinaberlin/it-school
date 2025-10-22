package com.github.alina.session22.homework.treeset;
//4. Write a Java program to create a reverse
//order view of the elements contained in a given tree set.


import java.util.TreeSet;

public class Four {
    public static void main(String[] args) {
        TreeSet set=new TreeSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println(set.reversed());
    }
}
