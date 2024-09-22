package org.example.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        readFromFile("abc");

        /* s = null;
        System.out.println(s.length());  //nullPointerException*/
    }

    public static void readFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }
}
