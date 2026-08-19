package com.interfaces;
interface Shape {
	int length = 10;   // final & static
	int width = 20;    // final static
	
	void circle(); // abstract method
	  default void square() {
		  System.out.println("Shape.square() : " + length);
	  }
	static void rectangle() {
		System.out.println("Shape.rectangle(): " + length * width);
	}
}
public class InterfaceDemo implements Shape 
{      public void circle() {
	System.out.println("InterfaceDemo.circle()");
}
	public static void main(String[] args) {
		/*
		InterfaceDemo  idobj = new  InterfaceDemo();
		
		idobj.circle();
		idobj.square();
		Shape.rectangle();
		*/
		
		 // Scenario - 2
		
		Shape sh = new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}
	
   
}
