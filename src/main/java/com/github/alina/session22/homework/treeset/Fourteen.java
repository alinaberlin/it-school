package com.github.alina.session22.homework.treeset;

import java.util.TreeSet;

//14. Write a Java program to retrieve and
// remove the first element of a tree set.
public class Fourteen {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println(removeFirst(treeSet));
    }
    static Integer removeFirst(TreeSet<Integer> treeSet) {
        Integer result=   treeSet.removeFirst();
        return result;
}}
