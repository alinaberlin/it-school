package com.github.alina.session25.homework;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, use streams to create a single string which is a concatenation
// of all strings separated by a comma.
// (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
public class Four {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        String oneString= strings.stream().reduce("", String::concat);
        System.out.println(oneString);
    }
}
