package com.github.alina.session22.homework.treeset;
//7. Write a Java program to get the number of elements in a tree set.


import java.util.TreeSet;

public class Seven {
    static TreeSet<Integer> treeSet=  new TreeSet<>();
    public static void main(String[] args) {
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        System.out.println(treeSet.size());
    }
}
