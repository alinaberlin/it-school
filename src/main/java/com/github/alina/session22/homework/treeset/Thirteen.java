package com.github.alina.session22.homework.treeset;

import java.util.TreeSet;

//13. Write a Java program to get an element in a tree set
// which is strictly less than the given element.
public class Thirteen {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println(findStrickLees(treeSet, 5));

    }
    static public Integer findStrickLees (TreeSet<Integer> treeSet, Integer value) {
        Integer result=   treeSet.stream().filter(n-> n>value).findFirst().orElse(null);
        return result;
    }
}
