package com.contructure.students1;
 class Student {
	 
	 private int rollNo;
	 private String name;
	 private double percentage;
	 
	 void display() {
		 System.out.println("RollNo: " + rollNo);
		 System.out.println("Name: " + name);
		 System.out.println("Percentage: " +percentage);
	 }
	 public void setData(int x, String y, double z) {
		 rollNo = x;
		 name = y;
		 percentage = z;
	 }
	 
	 public int getRollNo() {
		 return rollNo;
	 }
	 public String getName() {
		 return name;
	 }
	 public double getPercentage() {
		 return percentage;
}
	
}
public class Main {

	public static void main(String[] args) {
		Student st = new Student();
		st.setData(1, "Sachin", 99.5);
		System.out.println("Get the Name: " + st.getName());
		System.out.println("Get the RollNumber: " + st.getRollNo());
		System.out.println("Get the Percentage: " + st.getPercentage());
		st.display();
	

	}

}
