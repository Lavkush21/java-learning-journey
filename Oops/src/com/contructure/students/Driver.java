package com.contructure.students;
class Student {
	 int rollNo;
	 String name;
	 double percentage;
	

      void display() {		
  System.out.println("RollNo: " + rollNo);
  System.out.println("Name: " + name);
  System.out.println("Percentage: " + percentage);
  
		}
	}

public class Driver {

	public static void main(String[] args) {
	  Student st =  new Student();
	   st.rollNo =123;
	   st.name = "Lavkush";
	   st.percentage = 45.78;
	   st.display();

	}

}
