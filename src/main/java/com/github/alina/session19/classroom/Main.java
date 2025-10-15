package com.github.alina.session19.classroom;

import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("insert which vehicle to start: ");
//        String type = scanner.nextLine();
//        //Vehicle vehicle;
//        Vehicle vehicle=null;
//
//        if(type.equals("vehicle")) {
//        vehicle = new Vehicle();
//    } else if ((type.equals("car"))) {
//            vehicle = new Car();
//        } else if (type.equals("motocycle")) {
//            vehicle = new Motocycle();
//
//        }else {
//            //vehicle =null;
//            System.out.println("invalid type");
//            return; // ieșim, nu apelăm start() pe un obiect inexistent
//
//        }
//        vehicle.start();
//        System.out.println("====");
//}}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert which vehicle to start: ");
        String type = scanner.nextLine().trim().toLowerCase();

        Vehicle vehicle;

        switch (type) {
            case "vehicle" -> vehicle = new Vehicle();
            case "car"     -> vehicle = new Car();
            case "motocycle", "motorcycle" -> vehicle = new Motocycle();
            default -> {
                System.out.println("invalid type");
                return;
            }
        }

        vehicle.start();
        System.out.println("====");
    }
}