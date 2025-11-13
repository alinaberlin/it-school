package com.github.alina.session25.homework;
//Given a string,  use streams to count the number of
// vowels in it. (Input: String sentence = "Hello World";)
import java.util.Arrays;

public class Eight {
    public static void main(String[] args) {
        String sentence = "Hello World";
       long result = Arrays.stream(sentence.split(" "))
               .map(s->s.replaceAll("[^aeiou]", ""))
               .map(String::length).reduce(0, Integer::sum);
        System.out.println(result);
    }
}