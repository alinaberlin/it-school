package com.github.alina.session25.homework;

import java.util.List;

//Given a list of integers, create a new list that contains only the even numbers.
// Use streams to achieve this. (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)
public class One {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list2);
    }
}
