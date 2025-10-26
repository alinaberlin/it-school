package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//9. Write a Java program to create a set view of the mappings contained in a map.
public class Nine {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<>();
       map.put(1,"a");
       map.put(2,"b");
       map.put(3,"c");
       map.put(4,"d");
       map.put(5,"e");
       // create set view for the map
        Set set = map.entrySet();
        System.out.println(set);
    }
}
