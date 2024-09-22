package org.example.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in); //if we enter string it throws InputMissMatchException
        int num = sc.nextInt();
        System.out.println(num);*/
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println("The number is: " + num);

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int out = x/y;
            //System.exit(0);  //Terminate the application. finally{} block will not execute
        } catch (InputMismatchException e) {
            System.out.println("you entered an wrong input.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible.");
        } catch (NullPointerException e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Goodbye!");
        }

    }
}
