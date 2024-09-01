package org.example.thread100;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        for(int i=1; i<=100; i++){
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(10); //only 10 threads

        for (int i = 1; i <= 100; i++) {

            if(i==10 || i==50 || i==98) {
                System.out.println("DEBUG");
            }

            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
        //you can Shut down the executor service
        //executorService.shutdown();

        NumberPrinter numberPrinter = new NumberPrinter(100);
        executorService.execute(numberPrinter);
    }
}
