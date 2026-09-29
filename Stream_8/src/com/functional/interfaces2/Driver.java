package com.functional.interfaces2;


interface Cab {
	public void bookCab(String source, String destination);
}
class Ola implements Cab {
	public void bookCab(String source, String destination) {
		System.out.println("Ola.bookCab(): " + source + " To " + destination);
	}
}
public class Driver {
	public static void main(String[] args) {
		Cab c = new Ola();
		c.bookCab("Delhi", "Mubbai");
	}

}
