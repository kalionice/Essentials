package com.MWcode;

public class Essential {
    public static void main(String[] args) {
        // Primitive Types
        int a = 10;
        int b = a;
        a = 100;
        System.out.println(a);
        System.out.println(b);

        // Reference Types

        Peop alex = new Peop("alex");
        Peop mariam = alex;

        alex.name = "Alexander";

        System.out.println(alex.name);
        System.out.println(mariam.name);
    }

    static class Peop {
        String name;

        Peop(String name) {
            this.name = name;
        }
    }
}
