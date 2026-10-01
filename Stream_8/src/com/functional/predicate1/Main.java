package com.functional.predicate1;

import java.util.function.Predicate;

class Employee {
	int id;
	String name;
	String address;
	long phone;
	
	
	Employee(int ids, String names,String add, long number){
		id = ids;
		name = names;
		address = add;
		phone = number;
		
	}


	
}
public class Main {

	public static void main(String[] args) {
		Employee em = new Employee(1, "Lavkush", "Prayagraj", 912321123);
		Predicate<Employee> p = i->( i.name.length() >4 && i.id > 4);
		System.out.println(p.test(em));
	

	}

}
