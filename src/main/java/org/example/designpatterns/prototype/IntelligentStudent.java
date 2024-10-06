package org.example.designpatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    IntelligentStudent(IntelligentStudent student) {
        super(student); //calling from copy constructor student
        this.iq = student.iq;
    }

    //Overriding clone Object// @Override is not mandatory
    public IntelligentStudent clone() {
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setAge(this.getAge());
//        intelligentStudent.setPsp(this.getPsp());
//        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());
//
//        intelligentStudent.iq = this.iq;
//        return intelligentStudent;

        return new IntelligentStudent(this);//copy constructor concept
    }

}
