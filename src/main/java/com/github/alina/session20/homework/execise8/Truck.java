package com.github.alina.session20.homework.execise8;

public class Truck implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Truck accelerate");
    }

    @Override
    public void stop() {
       System.out.println("Truck stop");
    }

    @Override
    public void start() {
      System.out.println("Truck start");
    }
}
