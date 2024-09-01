package org.example.multithreading.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        //write the code you want tot execute via a separate thread
        System.out.println("Hello World from Printer execute in another thread, Printed by : " + Thread.currentThread().getName());
    }
}
