package com.github.alina.session22.homework.hashmap;
//5. Write a Java program to check whether a map
// contains key-value mappings (empty) or not.

import java.util.HashMap;
import java.util.Map;

public class Five {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>() ;
        map.put(3, 3);
        map.put(5, 5);
        map.put(6, 6);
       System.out.println( "Empty is" + " "+ map.isEmpty());

    }
}
