package com.functional.interfaces;

import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experience;
	
	Employee(String name, int sal, int exp) 
	{
		ename = name;
		salary = sal;
		experience = exp;
	}
}
public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Lavkush", 5000,5);
		
		
		// emp obj --> return name if sal > 30k exp > 3
		Predicate<Employee>pr =e->(e.salary > 3000 && e.experience > 3);
		System.out.println(pr.test(emp));
		

	}

}
