package com.function.consumer.student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
    String name;
    int rawScore;

    Student(String name, int rawScore) {
        this.name = name;
        this.rawScore = rawScore;
    }
}

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 92));
        studentList.add(new Student("Bob", 74));
        studentList.add(new Student("Charlie", 58));
        studentList.add(new Student("Diana", 85));

        // 1. Function: Converts an integer raw score into a letter grade (String)
        Function<Student, String> determineGrade = student -> {
            if (student.rawScore >= 90) return "A";
            if (student.rawScore >= 80) return "B";
            if (student.rawScore >= 70) return "C";
            if (student.rawScore >= 60) return "D";
            return "F";
        };

        // 2. Predicate: Checks if the letter grade requires Academic Improvement support (D or F)
        Predicate<String> needsImprovement = grade -> grade.equals("D") || grade.equals("F");

        // 3. Consumer: Prints a formal warning notification for the student
        Consumer<Student> printWarning = student -> {
            System.out.println("⚠️ ACADEMIC NOTICE: ACTION REQUIRED");
            System.out.println("Student Name: " + student.name);
            System.out.println("Current Score: " + student.rawScore + "%");
        };

        // Processing the students
        System.out.println("--- Reviewing Student Performance Pipelines ---");
        for (Student s : studentList) {
            String letterGrade = determineGrade.apply(s);
            
            // Check if the student's grade puts them in the improvement category
            if (needsImprovement.test(letterGrade)) {
                printWarning.accept(s);
                System.out.println("Assigned Status: Scheduled for Mandatory Tutoring (Grade: " + letterGrade + ")");
                System.out.println("----------------------------------------------");
            }
        }
    }
}
