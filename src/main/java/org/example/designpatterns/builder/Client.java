package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//       // Builder builder = new Builder();   //this is calling from Builder class
//
//        Builder builder = Student.getBuilder();     //this is calling from Student class getBuilder method which is static
//        builder.setName("Rajneesh");
//        builder.setAge(25);
//        builder.setPsp(95.0);
//        builder.setGradYear(2021);
//
//        //Student student = new Student(builder); //insted of call new constructor directly
//        Student student = builder.build();          //we call builder.build()

        //this syntax only for designing, another way of writing above code, otherwise you can go with the above one
        //this is more readable, production ready code
        Student student = Student.getBuilder()
                .setName("Rajneesh")
                .setAge(25)
                .setBatch("Aug23 Beginner")
                .setGradYear(2021)
                .setUnivName("Scaler")
                .build();

        System.out.println("DEBUG");
    }
}
