package com.oops.inheritance;

public class PassingParamsMainMethod {

	public static void main(String[] args) {
		
		// how to pass parameters to main method??
		System.out.println("PassingParamsMainMethod.main() : " + args.length);
		for(String value :args) {
			System.out.println(value);
		}
	}

}
