package com.github.alina.session22.homework.treeset;
//10. Write a Java program to get the element in
// a tree set which is greater than or equal to the given element.

import java.util.TreeSet;

public class Ten {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(10);
       System.out.println(findBigerThan(treeSet, 11));
    }
    static Integer findBigerThan(TreeSet<Integer> treeSet, Integer value) {
        Integer rezult= treeSet.stream().
                filter(n->n>=value).findFirst().orElse(null);
        return rezult;
 }}
