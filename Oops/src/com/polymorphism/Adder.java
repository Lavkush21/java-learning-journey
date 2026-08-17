package com.polymorphism;

public class Adder {
	int a = 10;
	int b = 20;
	void sum() {
		System.out.println("Adder.sum(): " + a + b);
	}
	void sum(int x, int y) {
		System.out.println("add x and y:" + a + b);
	}
	void sum(int x, double y) 
	{
		System.out.println("Adder.sum(): " + x + y);
	}
       void sum(double x, int y)
       {
    	   System.out.println("Adder.sum()" + x + y);
       }
}
