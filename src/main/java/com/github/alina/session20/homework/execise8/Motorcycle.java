package com.github.alina.session20.homework.execise8;

public class Motorcycle implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stop");
    }

    @Override
    public void start() {
        System.out.println("Motorcycle start");
    }
}
