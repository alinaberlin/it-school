package com.github.alina.session25.homework;
//Using a stream of strings representing numbers (e.g., "1", "2", "3"),
// convert them to integers and find the product of all numbers using reduce.
// (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)

import java.util.Arrays;
import java.util.List;

public class Thirteen {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        int rezultat =numbers.stream().mapToInt(Integer::parseInt).reduce(0,Integer::sum);
        System.out.println(rezultat);
    }
}
