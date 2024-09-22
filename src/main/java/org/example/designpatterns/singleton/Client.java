package org.example.designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection1 = DBConnection.getInstance();
        System.out.println("DEBUG");
    }
}
