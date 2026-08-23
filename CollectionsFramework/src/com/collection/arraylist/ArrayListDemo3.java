package com.collection.arraylist;

import java.util.ArrayList; 
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		String arr[] = {"Cat", "elephant", "Dog"};
		
		for(String value : arr) 
		{
			System.out.println("ArrayListDemo3.main() : " + value);
		}
		
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
	
		System.out.println("Converted ArrayList elements: " + al);
	}
}
