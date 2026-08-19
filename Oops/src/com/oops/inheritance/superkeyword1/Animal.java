package com.oops.inheritance.superkeyword1;

public class Animal {
	String color = "white";
	void eat() {
		System.out.println("Animal.eat()");
	}

}

class Dog extends Animal {
	String color = "black";
	void displayColor() {
		System.out.println("Dog.displayColor()");
		super.eat();
	}
}
