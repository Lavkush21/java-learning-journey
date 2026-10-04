package com.function.consumer.employees;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String ename;
    int salary;
    String gender;
    
    Employee(String ename, int salary, String gender) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
    }
}

public class Main {

    public static void main(String[] args) {
       
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        emplist.add(new Employee("David", 50000, "Male"));
        emplist.add(new Employee("John", 30000, "Male"));
        emplist.add(new Employee("Scott", 60000, "Female"));
        
        // Function: Calculates 10% bonus
        Function<Employee, Integer> f = emp -> (emp.salary * 10) / 100;
        
        // Predicate: Checks if the bonus is 5000 or more
        Predicate<Integer> p = b -> b >= 5000;
        
        // Consumer: Prints employee details
        Consumer<Employee> c = emp -> {
            System.out.println("Employee Name: " + emp.ename);
            System.out.println("Employee Salary: " + emp.salary);
            System.out.println("Employee Gender: " + emp.gender);
        };
        
        // Processing the list
        for (Employee e : emplist) {
            int bonus = f.apply(e);
            if (p.test(bonus)) {
                c.accept(e);
                System.out.println("Employee bonus: " + bonus);
                System.out.println("---------------------"); // Added for visual separation
            }
        }
    }
}
