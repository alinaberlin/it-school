package com.github.alina.session22.homework.hashmap;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to get a shallow copy of a HashMap instance.
public class Six {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>() ;
        map.put(3, 3);
        map.put(5, 5);
        map.put(6, 6);
        map.put(7, 7);
        Map<Integer,Integer> map2 = new HashMap<Integer, Integer>();
        map2= (Map<Integer, Integer>) map.clone();
        System.out.println("Clone is" + map2);
    }
}
