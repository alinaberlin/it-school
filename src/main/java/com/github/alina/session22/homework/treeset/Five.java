package com.github.alina.session22.homework.treeset;
//5. Write a Java program to get the first and
//last elements in a tree set.

import java.util.TreeSet;

public class Five {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println(set.first() + " " + set.last());
    }
}
