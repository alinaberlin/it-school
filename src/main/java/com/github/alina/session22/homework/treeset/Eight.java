package com.github.alina.session22.homework.treeset;
//8. Write a Java program to compare two tree sets.

import javax.management.PersistentMBean;
import java.util.TreeSet;

public class Eight {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(2);
        treeSet.add(1);
        TreeSet<Integer> treeSet2 = new TreeSet();
        treeSet2.add(1);
        treeSet2.add(2);
        System.out.println(treeSet.equals(treeSet2));
    }
}
