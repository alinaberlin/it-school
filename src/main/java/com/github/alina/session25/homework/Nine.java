package com.github.alina.session25.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of sentences, use flatMap to create a list of all words in all the sentences,
// and then find the most frequently occurring word.
// (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
public class Nine {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        List<String> flattenedStrings = sentences.stream().
                flatMap(s -> Arrays.stream(s.split(" "))).toList();
        Map<String, Long> occurredWords = flattenedStrings.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(occurredWords);
    }
}
