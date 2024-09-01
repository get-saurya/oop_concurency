package org.example.multithreading.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello from Client, Printed by : " + Thread.currentThread().getName());

        //1.Create a task object.
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        //2.Create a thread. //3. Assign the task to the thread.
        Thread thread1 = new Thread(helloWorldPrinter);

        //4.Start the thread
        thread1.start();

        System.out.println("Hello after thread start from client, Printed by : " + Thread.currentThread().getName());

    }
}
