package com.github.alina.session25.homework;

import java.util.Arrays;

//Create a stream of integers from an array and find the sum of all integers using the reduce method.
// (Input: Integer[] numbers = {1, 2, 3, 4, 5};)
public class Six {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        var  rezult= Arrays.stream(numbers).reduce(0,(a,b)->a+b);
        System.out.println(rezult);
    }
}
