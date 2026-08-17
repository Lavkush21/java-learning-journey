package com.oops.methos.student;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("Lavkush", 1231, 12/21/04, 9);
		s.printStudentData();
		
		// object reference variable
		s.sid = 121;
		s.sname = "shivam";
		s.grad = 'A';
		s.printStudentData();
		
		
		// using methods
		s.setStudentData(101, "Rohit", 'B');
		s.printStudentData();
		
	}

}
