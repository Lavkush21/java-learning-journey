package com.oops.methos;

public class GreetingsMethod {
	public static void main(String[] args) {
		Greetings gs = new Greetings();
		gs.m1();
		
		String s = gs.m2();
		
		System.out.println("GreetingsMethod.main() " + s);
		
		gs.m3("Rohit");
	}

}
