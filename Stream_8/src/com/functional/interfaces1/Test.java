package com.functional.interfaces1;

@FunctionalInterface
interface Software {
	public void job();
	
}
public class Test {
public static void main(String[] args) {
      
	 Software s=()->System.out.println("Test.main()");
	 s.job();
}
}
