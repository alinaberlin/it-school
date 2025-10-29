package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;

//3. Write a Java program to copy all
// of the mappings from the specified map to another map.
public class Three {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        HashMap<Integer, Integer> map2 = new HashMap<>() ;
        map2.putAll(map);
        System.out.println(map2);
//        map2.entrySet().stream().forEach(entry -> {
//            map.put(entry.getKey(), entry.getValue().hashCode());
//        });
//        System.out.println(map2);
//      //System.out.println("map 2 is "  map2.putAll(map));
    }
}
