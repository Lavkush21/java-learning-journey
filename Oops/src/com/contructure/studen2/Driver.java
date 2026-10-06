package com.contructure.studen2;

class Student {
	
	int rollNumber;
	String name;
	int age;
	
	public void setData(int x, String y, int z) {
		rollNumber = x;
		name = y;
		age = z;
	}
	public int getData() {
		return rollNumber;
	}
	public String getName() {
		return name;
		

	}
	public int getAge() {
		return age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
}
public class Driver {

	public static void main(String[] args) {
		Student st = new Student();
			st.setData(13,"Rohit", 45);
		     System.out.println("Get the name: " + st.getName());
		     System.out.println("Get the age: " + st.getAge());
		     System.out.println("Get the RollNumber: " + st.getRollNumber());


	}

}
