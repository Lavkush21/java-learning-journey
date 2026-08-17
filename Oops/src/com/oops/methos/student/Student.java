package com.oops.methos.student;

public class Student {
  int sid;
  String sname;
  char grad;
  
  
  void printStudentData() {
	  System.out.println("Student.printStudentData(): " + sid+"  " + sname +"  " + grad );
  }
	void setStudentData(int id, String name, char gr) {

		sid = id;
		sname = name;
		grad = gr;
	}
	Student(String name, int roll, int date, int i) {
		name = name;
		roll = roll;
		date = date;
		i = i;
		
	}
}
