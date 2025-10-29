package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

//2. Write a Java program to count the number
// of key-value (size) mappings in a map.
public class Two {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Alina", 2);
        map.put("Gabi", 3);
        map.put("Andrei", 4);
        System.out.println("Number of key-value mappings is" + " "+ map.size());
    }
}
