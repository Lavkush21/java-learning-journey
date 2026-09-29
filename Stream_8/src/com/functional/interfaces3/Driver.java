package com.functional.interfaces3;

interface Cab {
	public void booking(String source, String destination);
	}
class UBER  implements Cab {
	public void booking(String source, String destination) {
		System.out.println("UBER.booking() : " + source + " To : " + destination);
	}
}
public class Driver {

	public static void main(String[] args) {
	Cab c = new UBER();
	c.booking("Agar", "Prayagraj");

	}

}
