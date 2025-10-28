package com.github.alina.session2.duplicate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        List<String> name= new ArrayList<>(List.of("Alina", "Alice", "Alice", "Mihaela", "Camelia", "Mihaela"));
        Set<String> duplicates = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for(String item:name)
            if (!unique.add(item)) {
                duplicates.add(item);
               // System.out.println(unique);
            }
         System.out.println(duplicates);
    }}

