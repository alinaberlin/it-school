package com.github.alina.session23.homework;

import java.util.List;

//Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
public class One {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list2);
    }
}
