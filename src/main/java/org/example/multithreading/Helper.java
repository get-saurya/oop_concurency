package org.example.multithreading;

public class Helper {
    public static void doSomething() {
        System.out.println("Hello from Helper class, Printed by : " + Thread.currentThread().getName());
    }
}
