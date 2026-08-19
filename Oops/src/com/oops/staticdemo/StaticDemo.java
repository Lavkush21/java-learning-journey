package com.oops.staticdemo;

public class StaticDemo {
	static int  a = 10; // static variable
	int b = 20;  // non-static variable
	
	static void m1() // static
	{
		System.out.println("StaticDemo.m1()...");
	}
	void m2() {
		System.out.println("StaticDemo.m2()...");
	}
	public static void main(String[] args) {
		System.out.println(a);  // 1 . static method can can access directly without creating any object
		m1();
		
		StaticDemo  sb = new StaticDemo();
		
		System.out.println(sb.b);
		sb.m2();
	}
	
}

