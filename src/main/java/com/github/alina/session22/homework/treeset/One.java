package com.github.alina.session22.homework.treeset;
//1.Write a Java program to associate the
//specified value with the specified key in a Tree Map.
//

import java.util.Map;
import java.util.TreeMap;

public class One {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> list = new TreeMap<>();
        list.put(1, 1);
        list.put(2, 2);
        list.put(3, 3);
        for(Map.Entry<Integer, Integer> entry : list.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
        }
        System.out.println("Enter first number: " + list.get(1));
    }
}
