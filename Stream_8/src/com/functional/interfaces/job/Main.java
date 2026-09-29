package com.functional.interfaces.job;


@FunctionalInterface
interface Engineer {
	public void job();
		
	}
class Software implements Engineer {
	public void job() {
		System.out.println("Software.job()");
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Engineer s = new Software();
		s.job();
	}

}
