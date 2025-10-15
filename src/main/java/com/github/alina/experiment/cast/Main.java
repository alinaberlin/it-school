package com.github.alina.experiment.cast;

public class Main {
    public static void main(String[] args) {

        class Animal {
            void sunet() {
                System.out.println("Animalul face un sunet...");

            }
        }

        class Caine extends Animal {
            void latra() {
                System.out.println("Ham Ham!");
            }
        }

        class Pisica extends Animal {
            void miauna() {
                System.out.println("Miau Miau!");
            }
        }

        Animal a = new Pisica();   // obiect real: Pisica

        // Cast forțat (GREȘIT)
        Animal b = new Caine();
        Caine c = (Caine) b;       // spunem că e Caine, dar NU e!
        c.latra();
        b.sunet();
        c.sunet();
        //((Caine) new Animal()).latra();
    }
    }

