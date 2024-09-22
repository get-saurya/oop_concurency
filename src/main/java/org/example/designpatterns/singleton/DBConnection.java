package org.example.designpatterns.singleton;

public class DBConnection {
    private static DBConnection instance;   //instead of creating more than one DBConnection object we return the same object so we apply the if else condition and create a private static variable(instance).
    String url;
    String username;
    String password;

    private DBConnection() {        //declare constructor as private so that anyone can't create object of this class/To prevent direct instantiation from outside the class.

    }

    public static DBConnection getInstance() {      //we access the object of private constructor by a public static method and a static method can't access non static variable.
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
