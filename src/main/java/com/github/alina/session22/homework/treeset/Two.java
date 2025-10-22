package com.github.alina.session22.homework.treeset;
//2. Write a Java program to iterate through all
// elements in a tree set.

import java.util.TreeSet;

public class Two {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
       for(int i=0; i<=treeSet.size(); i++){
           System.out.println(i);
       }
    }
}
