package org.example.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        //1.Create Prototype object for every batch
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student surajit = studentRegistry.get("Aug23Evening").clone();
        surajit.setName("Surajit");
        surajit.setAge(23);
        surajit.setPsp(91.0);

        Student suman = studentRegistry.get("Aug23Evening").clone();
        suman.setName("Suman");
        suman.setAge(23);
        suman.setPsp(88.0);

        Student jay = studentRegistry.get("Aug23EveIntelligent").clone();
       // System.out.println("DEBUG");
    }

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student august23Evening = new Student();
        august23Evening.setBatch("August23 Evening Batch");
        august23Evening.setAvgBatchPsp(72.05);

        studentRegistry.register("Aug23Evening", august23Evening);

        Student august23EveningIntelligent = new IntelligentStudent();
        august23EveningIntelligent.setBatch("August23 Evening Intelligent");
        august23EveningIntelligent .setAvgBatchPsp(95.05);
        studentRegistry.register("Aug23EveIntelligent", august23EveningIntelligent);
    }
}
