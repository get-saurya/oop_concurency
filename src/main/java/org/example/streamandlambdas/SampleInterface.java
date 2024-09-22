package org.example.streamandlambdas;
//functional Interface : only one abstract method allow in a Functional Interface, to restrict that we use @FunctionalInterface annotation

@FunctionalInterface
public interface SampleInterface {
    void run(); //Abstract method 1: method without body called abstract method

   // void walk(); //Abstract method 2: there is two Abstract method so it will give error because of annotation
}
