package com.github.alina.session22.homework.hashmap;
//1.Write a Java program to associate
// the specified value with the specified key in a HashMap.

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class One {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
//        for(Map.Entry x:map.entrySet()){
//            System.out.println(x.getKey()+" "+x.getValue());
//        }
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
