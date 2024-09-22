package org.example.streamandlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {
        /*we can't create an object of an interface because interfaces are incomplete, because they don't have method bodies,
        they just have method signature, they just have method declaration, not definition*/

        //3 ways to create object of type interface
        //1.Create a class that implements and provide the method body to all the


        //2.Anonymous Class
        //Runnable runnable = new Runnable(); we can't create the object of an interface without providing the method body, but if you provide method body you can use this type of object;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
            }
        };

        //3.lambdas
        //() : Method input params
        //{} : Method body/implementation
        Runnable r = () -> {
            System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
        };
        // Thread thread = new Thread(runnable);
        Thread thread = new Thread(r);
        thread.start();

        //instead of create an Object and passing it, we can write direct lambda expression within the function
        Thread thread1 = new Thread(() -> {
           // return 0;           //thread constructor only excepts runnable interface that has run() method which returns nothing
            System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
        });
        //thread1.start();


        List<Student> students = new ArrayList<>();

        students.add(new Student("Rajneesh", 23, 5, "LLD Evening Batch"));
        students.add(new Student("Deepak", 28, 10, "Non DSA Batch"));
        students.add(new Student("Sandhya", 24, 2, "Project Evening Batch"));
        students.add(new Student("Irfan", 20, 15, "Scaler"));
        students.add(new Student("Apurv", 25, 1, "LLD"));

        /*Comparator<Student> ageComparator = (st1, st2) -> {
            if (st1.age < st2.age) return -1;
            else if (st1.age > st2.age) return 1;
            return 0;
        };
        Collections.sort(students, ageComparator);*/
        //we can write lambda function like that also
       // Collections.sort(students, (o1, o2) -> {return o1.age - o2.age;});
        Collections.sort(students, (a, b) -> a.age - b.age);

        System.out.println(students);
    }
}
