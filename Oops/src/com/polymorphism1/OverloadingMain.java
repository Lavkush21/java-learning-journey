package com.polymorphism1;

public class OverloadingMain {

	
	
	  void main(int x) {
		  System.out.println("OverloadingMain.main() : " + x);
		   
	   }
	  
	  void main(String s) {
		  System.out.println("OverloadingMain.main() : " + s);
	  }
	  void main(String s1, String s2) {
		  System.out.println("OverloadingMain.main() : " + s1+ s2);
	  }
	public static void main(String[] args) {
		OverloadingMain n = new OverloadingMain();
		n.main(100);
		n.main("lavkush");
		n.main("Hello: ", "Lavkush");

	}

}
