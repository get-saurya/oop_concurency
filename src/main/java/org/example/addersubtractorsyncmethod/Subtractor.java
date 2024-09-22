package org.example.addersubtractorsyncmethod;

public class Subtractor implements Runnable {
    private Count count;


    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
           // count.value -= i;  //cant access private variable from Count class,
            count.incrementValue(-i);
        }
    }
}
