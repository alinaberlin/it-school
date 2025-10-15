package com.github.alina.session1.homework.execise;

/*
4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.
 */

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Sum: " + (a + b));
        sc.close();

    }
}
