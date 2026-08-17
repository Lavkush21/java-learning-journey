package com.oops.encapsulation;

public class Main {

	public static void main(String[] args) {
		Account ac = new Account();
      ac.setAccno(12);
      ac.setAmount(12.12);
      ac.setName("Lavkush");
     
      
      
      System.out.println("Main.main(): " + ac.getAccno());
      System.out.println("Main.main(): " + ac.getAmount());
      System.out.println("Main.main(): " + ac.getName());
	}

}
