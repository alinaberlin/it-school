package com.github.alina.session22.homework.treeset;

import java.util.TreeSet;

//11. Write a Java program to get the element in a tree
// set which is less than or equal to the given element.
public class Eleven {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println(findLesOrEgual(treeSet,6));
    }
    static Integer findLesOrEgual(TreeSet<Integer> treeSet, Integer value) {
      Integer result=   treeSet.stream().filter(n-> n<= value).findFirst().orElse(null);
      return result;
    }
}
