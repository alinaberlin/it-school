package com.github.alina.session6.classroom;

public class methods {
        public static void main(String[] args) {
            int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sumOfEvenNumbers = sumOfEvenNumbers(myArray, 1, 'x');
            String a = "Alina";
            int b = 2;
//            System.out.println(a.concat(String.valueOf(b)));

            System.out.println(sumOfEvenNumbers);

            printArray("my string", 'a', 'b', 'c');

            char[] charArray = {'a', 'b', 'c'};
            printArrayWithATwist(charArray);
            printArrayWithATwist(charArray, false);
            printArrayWithATwist(charArray, true, false, false);

            System.out.println(getSomething(-1));
            System.out.println(getSomething(0));
            System.out.println(getSomething(19));
        }

        public static int sumOfEvenNumbers(int[] array, int x, char y) {
            int sum = 0;

            for (int elem : array) {
                if (elem % 2 == 0) {
                    sum += elem;
                }
            }

            otherMethod(x, y);
            return sum;
        }

        public static void otherMethod(int x, char y) {
            System.out.println(x + " " + y);
        }

        // varargs
        public static void printArray(String s, char... array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }

        // varargs
        public static void printArrayWithATwist(char[] array, boolean... something) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            if (something.length > 0 && something[0]) {
                System.out.println("something");
            }
        }

        public static String getSomething(int x) {
            if (x < 0) {
                return "This is a negative number";
            } else if (x == 0) {
                return "This is a zero";
            }
            return "This is a positive number";
        }

    }

