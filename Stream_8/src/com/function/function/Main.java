package com.function.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	
	Employee(String ename, int salary) 
	{
		this.ename = ename;
		this.salary = salary;
	}
}

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("David", 50000));
        emplist.add(new Employee("John", 30000));
        emplist.add(new Employee("mary", 20000));
        
        Function<Employee, Integer> f = e -> {
            int sal = e.salary;
            if(sal >= 10000 && sal <= 20000)
                return (sal * 10 / 100);
            else if(sal > 20000 && sal <= 30000)
                return (sal * 20 / 100);
            else if(sal > 30000 && sal <= 50000)
                return (sal * 30 / 100);
            else
                return (sal * 40 / 100);
        };
        
        // Predicate checks if bonus is greater than 5000
        Predicate<Integer> p = b -> b > 5000;
        
        for(Employee emp : emplist) {
            int bonus = f.apply(emp);
            
            // Fixed: Removed the trailing semicolon and wrapped the code block
            if(p.test(bonus)) {
            	
                // Enhanced the print statement to show the bonus amount too
                System.out.println("Employee: " + emp.ename + " | Salary: " + emp.salary + " | Bonus: " + bonus);
            }
        }
    }
}

// output
// Employee: David | Salary: 50000 | Bonus: 15000
//Employee: John | Salary: 30000 | Bonus: 6000

