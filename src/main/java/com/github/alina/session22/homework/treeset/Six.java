package com.github.alina.session22.homework.treeset;
//6. Write a Java program to clone a
//        tree set list to another tree set.

import java.util.TreeSet;

public class Six {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        TreeSet set2 = (TreeSet) set.clone();
        System.out.println("set2 is a clone " +set2);
    }
}
