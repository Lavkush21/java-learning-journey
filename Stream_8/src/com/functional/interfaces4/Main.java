package com.functional.interfaces4;


@FunctionalInterface
interface Cab {
	public String bookCab(String source,String destination);
}
public class Main {

	public static void main(String[] args) {
		Cab c =(source, destination)->{System.out.println("Main.main() : " + source+ " To " + destination);
		return ("Price: 500 Rs");
		};
		System.out.println(c.bookCab("Mumbai", "Hyd"));
		

	}

}
