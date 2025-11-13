package com.github.alina.session25.homework;
//Use streams to transform a
// list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)

import java.util.Arrays;
import java.util.List;

public class Seven {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        List<String> stringsLength = strings.stream().map(p -> String.valueOf(p.length())).toList();
        System.out.println(stringsLength);
    }
}
