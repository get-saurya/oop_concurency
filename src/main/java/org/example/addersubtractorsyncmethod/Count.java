package org.example.addersubtractorsyncmethod;

public class Count {
    private int value;

    //constructor
    public Count (int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementValue(int i) {
        this.value += i;
    }
}
