package org.example.producerconsumermutex;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(Queue<Object> store, int maxSize, String name,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore ) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;

    }

    @Override
    public void run() {
//        while(true) {
//            synchronized (Queue.class) {
//                if(store.size() > 0 ) { // size=1
//                    System.out.println(this.name + " is consuming an item, size = " + store.size());
//                    store.remove();     //C1, C2
//                }
//            }
//        }
        while(true) {
            try {
                consumerSemaphore.acquire();    //consumer semaphore--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // if(store.size() > 0) {        //we can remove this if condition bcoz of consumerSemaphore.acquire() at line no 35;
                System.out.println(this.name + " is consuming an item, size = " + store.size());
                store.remove();
            //}
            producerSemaphore.release();    //Notification mechanism
        }
    }
}
