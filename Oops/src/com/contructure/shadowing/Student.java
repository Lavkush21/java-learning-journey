package com.contructure.shadowing;

class Student {
	int rollNo;
	String name;
	double percentage;
	
	
	Student(int rollNo, String name, double percentage) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	void display() {
		
		System.out.println("RollNo: " + rollNo);
		System.out.println("Name: " + name);
		System.out.println("Percentage: " + percentage);
	}

}
