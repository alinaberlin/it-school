package com.github.alina.session22.homework.treeset;
//9. Write a Java program to find the numbers less than 7 in a tree set.
import java.util.TreeSet;
public class Nine {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(7);
        treeSet.add(8);
        var tree2 =treeSet.stream().filter(n -> n<7).toList();
        System.out.println(tree2);
    }
}
