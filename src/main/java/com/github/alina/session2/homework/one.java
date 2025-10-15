package com.github.alina.session2.homework;
/*1. Even or Odd Checker
Write a Java program that takes an integer as input. If the number is even, print
 "Even". If it's odd, print "Odd".
 */

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(("Odd"));
        }
        else {
            System.out.println(("Even"));
        }
    }
}
