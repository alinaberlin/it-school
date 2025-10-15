package com.github.alina.session20.homework.execise8;
//Abstraction:

//Create an interface Vehicle with methods such as start(),
// stop(), and accelerate(). Create classes such as Car, Truck,
// and Motorcycle that implement the Vehicle interface,
// and implement the methods differently. Use these classes to
// create a traffic simulation that simulates different types of vehicles on a road.


public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle motorcycle = new Motorcycle();
        simulateTraffic(car);
        simulateTraffic(truck);
        simulateTraffic(motorcycle);
    }
   private static void simulateTraffic(Vehicle vehicle){
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        System.out.println("===");
    }
}
