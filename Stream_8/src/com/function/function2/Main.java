package com.function.function2;

import java.util.ArrayList;
import java.util.function.Function;

class Student {
	String name;
	int score;
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Alice", 85));
        studentList.add(new Student("Bob", 62));
        studentList.add(new Student("Charlie", 94));
        studentList.add(new Student("Diana", 45));
        
        Function<Student, String> gradeCalculator = s -> {
            int marks = s.score;
            if(marks >= 90) {
                return "A";
            } else if(marks >= 80) {
                return "B";
            } else if(marks >= 70) {
                return "C";
            } else if(marks >= 60) {
                return "D";
            } else {
                return "F";
            }
        };
        
        for(Student student : studentList) {
            String grade = gradeCalculator.apply(student);
            // Fixed the variable reference here to student.score
            System.out.println("Student: " + student.name + " | Score: " + student.score + " | Grade: " + grade);
        }
    }
}
