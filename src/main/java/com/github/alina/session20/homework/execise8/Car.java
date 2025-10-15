package com.github.alina.session20.homework.execise8;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void start() {
        System.out.println("Car start");
    }
}
