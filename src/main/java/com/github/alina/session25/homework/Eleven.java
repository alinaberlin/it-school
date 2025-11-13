package com.github.alina.session25.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//Create a stream from a text file and use stream
// operations to find and print the longest word in the file.
public class Eleven {
    public static void main(String[] args) {
        String text= "Create a stream from a text file and use stream operations to find and print the longest word in the file.";
        var theLongestWord = Arrays.stream(text.split(" ")).toList();
        Optional<String> words = theLongestWord.stream().max((s1, s2) -> s1.length() - s2.length());
        System.out.println(words.orElse(""));
    }
}
