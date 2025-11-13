package com.github.alina.session25.homework;
//  Create a stream of numbers from 1 to 100 and use
//  the filter operation to retain only those numbers which are prime.
import java.util.List;

public class Three {
    public static void main(String[] args) {
        List<Integer> numbers= List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = numbers.stream().filter(x -> true).toList();
        System.out.println(numbers2);
    }
}
