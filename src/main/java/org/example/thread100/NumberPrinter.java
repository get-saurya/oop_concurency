package org.example.thread100;

public class NumberPrinter implements Runnable {
    //create a constructor to print number
    private int numberToPrint;
    public NumberPrinter(int number) {
        this.numberToPrint = number;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint+", Printed by : "+Thread.currentThread().getName());
    }
}
