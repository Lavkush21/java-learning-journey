package com.oops.inheritance.superkeyword;

public class Animal {
	String color = "white";
          
}

class Dog extends Animal {
	String color = "black";
	void displayColor() {
		System.out.println("Dog.displayColor() : "  + super.color);
	}
}


 
