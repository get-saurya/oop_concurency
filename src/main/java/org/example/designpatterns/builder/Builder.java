//package org.example.designpatterns.builder;
//
//public class Builder {
//    private String name;
//    private int age;
//    private double psp;
//    private String batch;
//    private int gradYear;
//    private String univName;
//    private int rollNumber;
//
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public String getBatch() {
//        return batch;
//    }
//
//    public int getGradYear() {
//        return gradYear;
//    }
//
//    public String getUnivName() {
//        return univName;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//
//    public void setBatch(String batch) {
//        this.batch = batch;
//    }
//
//    public void setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//    }
//
//    public void setUnivName(String univName) {
//        this.univName = univName;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
//
//    public Student build(){
//        //validations start
//        if (this.getGradYear() >= 2024) {
//            throw new RuntimeException("Grad year should be less than or equal to 2023.");
//        }
//        //validations end
//        return new Student(this);
//    }
//
//}
