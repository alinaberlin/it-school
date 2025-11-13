package com.github.alina.session25.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Using streams, find the total number of characters across a list of strings excluding whitespace characters.
// (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
public class Ten {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
       List<String> totalNumberOfCharacters= strings.stream().
                flatMap(s -> Arrays.stream(s.split(" "))).toList();
       String total= String.join(" ", totalNumberOfCharacters);
       System.out.println(total.length());
    }
}
