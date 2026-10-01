package com.functional.interfaces;

import java.util.function.Predicate;

class Student {
    String namefull; 
    String address;
    long phoneNumber;
    int age;

    Student(String name, String add, long phone, int ag) {
        namefull = name;
        address = add;
        phoneNumber = phone;
        age = ag;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("LavksuhGupta", "Bijhauli", 9198008424L, 23);
        

        Predicate<Student> st = p -> (p.namefull.length() > 3 && p.age > 18);
        
        System.out.println("Main.main() : " + st.test(s));
    }
}
