package com.github.alina.session22.homework.treeset;
//16. Write a Java program to remove a given element from a tree set.

import java.util.TreeSet;

public class Sixteen {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        System.out.println(removeGivenElement(treeSet, 5));
        System.out.println(treeSet);
    }
    static boolean removeGivenElement(TreeSet<Integer> treeSet, Integer element) {
        return treeSet.remove(element);
    }
}
