package org.example.designpatterns.builder;

public class Student {
    private String name;
    private  int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNumber;

   private Student(Builder builder) {
//     //validations start
//     if (builder.getGradYear() >= 2024) {
//      throw new RuntimeException("Grad year should be less than or equal to 2023.");
//     }
//     //validations end


     this.name = builder.getName();
     this.age = builder.getAge();
     this.psp = builder.getAge();
    }

    //Student class itself is providing us a way to create Builder object
    public static Builder getBuilder() {     //we don't have any object of student class. Builder object will be creating before creating the student object
     return new Builder();                   //you would want to call the builder method without object of the student class, that's why we declared this as static method
    }


    //inner class//
    static class Builder {
       private String name;
       private int age;
       private double psp;
       private String batch;
       private int gradYear;
       private String univName;
       private int rollNumber;


       public String getName() {
        return name;
       }

       public Builder setName(String name) {
        this.name = name;
        return this;
       }

       public int getAge() {
        return age;
       }

       public Builder setAge(int age) {
        this.age = age;
        return this;
       }

       public double getPsp() {
        return psp;
       }

       public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
       }

       public String getBatch() {
        return batch;
       }

       public Builder setBatch(String batch) {
        this.batch = batch;
        return this;
       }

       public int getGradYear() {
        return gradYear;
       }

       public Builder setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
       }

       public String getUnivName() {
        return univName;
       }

       public Builder setUnivName(String univName) {
        this.univName = univName;
        return this;
       }

       public int getRollNumber() {
        return rollNumber;
       }

       public Builder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
       }



       public Student build(){
        //validations start
        if (this.getGradYear() >= 2024) {
         throw new RuntimeException("Grad year should be less than or equal to 2023.");
        }
        //validations end
        return new Student(this);
       }

    }


}
