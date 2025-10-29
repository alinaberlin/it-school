package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

//7. Write a Java program to test if a map
// contains a mapping for the specified key.
public class Seven {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        System.out.println(returnMap(map, 4));

    }
    static boolean returnMap(Map<Integer, Integer> map, Integer key) {
      return   map.containsKey(key);
    }
}
