package com.github.alina.session22.homework.treeset;

import java.util.TreeSet;

//15. Write a Java program to
// retrieve and remove the last element of a tree set.
public class Fifteenth {
    public static void main(String[] args) {
    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(2);
    treeSet.add(3);
    treeSet.add(4);
    System.out.println(removeLast(treeSet));
    }
    static Integer removeLast(TreeSet<Integer> treeSet) {
        Integer result=   treeSet.removeLast();
        return result;
    }
}
