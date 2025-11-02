package com.github.alina.session23.homework;

import java.util.List;

//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
public class Two {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer integer = list.stream().reduce(0, Integer::sum);
        System.out.println(integer);
    }
}
