package java8stream.flatmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student 
{
	String sname;
	int sid;
	char grade;
	
	Student(String sname, int sid, char grade) {
		this.sname = sname;
		this.sid = sid;
		this.grade = grade;
	}
}

public class Flatemapdemo3 { // Note: Good practice to capitalize class names (FlatMapDemo3)

	public static void main(String[] args) {
		
		List<Student> studentList1 = new ArrayList<Student>();
		studentList1.add(new Student("Lavkush", 101, 'A'));
		studentList1.add(new Student("Ashish", 102, 'B'));
		studentList1.add(new Student("Rohit", 103, 'C'));
		
		List<Student> studentList2 = new ArrayList<Student>();
		// Fixed: Adding students to studentList2 instead of studentList1
		studentList2.add(new Student("Shivam", 104, 'A'));
		studentList2.add(new Student("Priya", 105, 'B'));
		studentList2.add(new Student("Kajal", 106, 'C'));
		
		List<List<Student>> student = Arrays.asList(studentList1, studentList2);
		
		// 1. Before Java 8 Approach (Nested loops)
		System.out.println("--- Reading names using traditional loops ---");
		for(List<Student> s : student) {
			for(Student st : s) {
				System.out.println(st.sname);
			}
		}
		
		// 2. Modern Java 8 Approach (flatMap)
		System.out.println("\n--- Processing student names using flatMap() ---");
		
		List<String> studentNames = student.stream()
				.flatMap(sList -> sList.stream())         // Flattens List<List<Student>> to Stream<Student>
				.map(st -> st.sname)                     // Transforms Stream<Student> to Stream<String>
				.collect(Collectors.toList());           // Collects names into a flat List
		
		System.out.println("Flattened Names List: " + studentNames);
	}
}
