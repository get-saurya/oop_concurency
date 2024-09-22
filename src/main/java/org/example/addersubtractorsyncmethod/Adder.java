package org.example.addersubtractorsyncmethod;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            //count.value += i; //we can't call directly count.value bcoz it is declared private in Count class, so we have to call this via method/functions which is incrementValue from count class
           count.incrementValue(i);
        }
    }
}
