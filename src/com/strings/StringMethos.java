package com.strings;

import java.util.Arrays;

public class StringMethos {
	public static void main(String[] args) {
		System.out.println("welcome".length());
		
		
		// concat()- Join strings
		String s1 = "welcome";
		String s2 = " to java";
		String s3 = "automation";
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("Lavkush".concat("Gupta"));
		
		
		// trim()
		
		s1 ="   welcome ";
		System.out.println("before trim()" + s1);
		System.out.println("after trim()" + s1.trim());
		
		// character  -  return true or false
		
		s1 ="   welcome ";
		System.out.println(s1.charAt(3));
		
		// contains()
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.contains("welc"));
		System.out.println(s1.contains("come"));
		
		// equals(), equalsIgnoreCase() - compare Strings
		
		s1 = "welcome";
		s2 = "welcome";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		// replace() - replace single/ multiple(sequence) of character in a string
		
		s1 = "welcome to selenium java python seleium";
		System.out.println(s1.replace('e', 'L'));
		
		
		
		//   substring
		
		s1 = "Selenium";
		System.out.println(s1.substring(1,3));
		System.out.println(s1.substring(0,3));
		System.out.println(s1.substring(1,5));
		
		s1 = "Selenium";
		
	
	
	
	//  toUpperCase and toLowerCase
	s1 = "Selenium";
	
	System.out.println(s1.toUpperCase());
	System.out.println(s1.compareTo(s2));
	
	// split() - split the string into multiple parts based on delimiter
	s1 = "lav@gmail.com";
String a[] = s1.split("m");
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	System.out.println(Arrays.toString(a));
	
	String amount = "$15, 20, 55";
	System.out.println(amount.replace("$",""));
	System.out.println(amount.replace("$","").replace(",", ""));
	
	
	//  Split
	s1 = "abc,123@xyz";
	String arr1[] = s1.split(",");
	System.out.println(Arrays.toString(arr1));
	
	String arr2[] = arr1[1].split("@");
	System.out.println(Arrays.toString(arr2));
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	
	
	}
	

}
