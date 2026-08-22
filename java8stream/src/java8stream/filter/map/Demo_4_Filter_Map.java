package java8stream.filter.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        super();
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class Demo_4_Filter_Map {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(1, "Alex", 10000),
                new Employee(2, "Rohit", 200000),
                new Employee(3, "Rohan", 30000),
                new Employee(5, "Deepak", 454323),
                new Employee(6, "Kajal", 2354532));

        // combination of filter and map
        List<Integer> salaries = empList.stream()
                .filter(e -> e.salary > 20000)   
                .map(e -> e.salary)             
                .collect(Collectors.toList());

        System.out.println(salaries);
    }
}