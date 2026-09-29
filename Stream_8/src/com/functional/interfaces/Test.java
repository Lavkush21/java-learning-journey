package com.functional.interfaces;
@FunctionalInterface
interface Cab{
	public void bookCab();
}
class Ola implements Cab 
{
	public void bookCab() {
		System.out.println("Ola.bookCab()");
	}
}
public class Test {

	public static void main(String[] args) {
		Ola cab = new Ola();
		cab.bookCab();

	}

}
