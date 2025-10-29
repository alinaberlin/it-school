package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

//4. Write a Java program to remove all of the mappings from a map.
public class Four {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>() ;
        map.put(1, "Gabi");
        map.put(2, "Andrei");
        map.put(3, "Gabi");
        map.clear();
        System.out.println(map);
    }
}
