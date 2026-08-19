package com.interfaces1;

public class C1 extends C2 implements I1, I2{
	@Override
	public void m2() {
		System.out.println("X : " + x);
	}
	@Override
	public void m1() {
	System.out.println("Y: " + y);	
	}	
	public static void main(String[] args) {
	   C1 obj = new C1();
	   obj.m1();
	   obj.m2();
	}


	

}
