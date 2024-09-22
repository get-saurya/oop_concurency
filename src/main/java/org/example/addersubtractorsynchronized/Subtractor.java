package org.example.addersubtractorsynchronized;

public class Subtractor implements Runnable {
    private Count count;


    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            //instead of using lock.lock java has its own lock which is synchronized(Count.class) {}
            synchronized (Count.class) {    //lock.lock()
                count.value -= i;
            }   //lock.unlock();
        }
    }
}
