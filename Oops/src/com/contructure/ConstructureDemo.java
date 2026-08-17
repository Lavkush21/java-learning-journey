package com.contructure;

public class ConstructureDemo {
              int x , y;
	ConstructureDemo() {
		x = 100;
		y = 200;
	}
	
	ConstructureDemo(int a, int b) 
	{
		x = a;
		y = b;
	}
	
	void sum(int x, int y) 
	{
		System.out.println("ConstructureDemo.sum()" + x + y);
	}
	public static void main(String[] args) {
		

	}

}
