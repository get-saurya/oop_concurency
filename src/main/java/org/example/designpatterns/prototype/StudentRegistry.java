package org.example.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

//springboot used Registry to store all the object, we store here the prototype object of student
public class StudentRegistry {
    private Map<String, Student> studentMap = new HashMap<>();

    public void register(String key, Student student) {
        studentMap.put(key, student);
    }
    public Student get(String key) {
        return studentMap.get(key);
    }
}
