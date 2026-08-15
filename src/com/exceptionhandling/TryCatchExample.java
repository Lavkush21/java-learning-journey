package com.exceptionhandling;

public class TryCatchExample {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by zero.");
        }

        System.out.println("Program Ended");
    }
}