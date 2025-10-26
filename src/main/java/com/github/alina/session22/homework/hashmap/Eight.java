package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to test if a map// contains a mapping for the specified value.
public class Eight {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        System.out.println("The existence is" + " "+ existValue(map, 2));
    }
    static boolean existValue(Map<Integer, Integer> map, Integer value) {
        return map.containsKey(value);
    }
}
