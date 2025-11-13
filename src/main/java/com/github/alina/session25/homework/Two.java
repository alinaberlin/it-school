package com.github.alina.session25.homework;

import java.util.Arrays;
import java.util.List;

//Using a list of strings, find and print the longest string using Java streams.
// (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

public class Two {
    public static void main(String[] args) {
        List<String>  stringList= Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String theLongest=stringList.stream().max(String::compareTo).get();
        System.out.println(theLongest);

    }
}
