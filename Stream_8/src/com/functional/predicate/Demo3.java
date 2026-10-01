package com.functional.predicate;

import java.util.function.Predicate;




// Predicate ---> one parameter returns boolean
// use only if you have conditional checks in your program..
public class Demo3 {
	public static void main(String[] args) {
	Predicate<Integer> ps = p->(p > 20);
	System.out.println(ps.test(40)); // true
	
	
	
	
	Predicate<String> pt = s->(s.length() > 4);
	System.out.println(pt.test("Lavkush"));// true
		
	
	
	
	Predicate<Double> ds = d->(d >34.3);
	System.out.println(ds.test(45.1)); // true
	System.out.println(ds.test(22.1)); // false
	
	// Ex3 : Print array elements whose size is > 4 from array
	
	String names[] = {"Lavkush", "Deepak","Rohit","John","Mary"};
	
	
	for(String name : names) {
		
		
		if(pt.test(name)) {
			System.out.println("Demo3.main() : " + name);
		} 
		
		/*
		 * if(name.length()>4) {
		 * System.out.println(names)
		 */
	
	
	}}}

