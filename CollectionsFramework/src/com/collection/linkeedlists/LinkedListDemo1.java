package com.collection.linkeedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		
		// Declare Linked list
		LinkedList<Object> list = new LinkedList<>();
		
		// Add elements into linked list
		list.add(100);       // index 0
		list.add("welcome"); // index 1
		list.add(23.4);      // index 2
		list.add(true);      // index 3
		list.add(null);      // index 4
		System.out.println("Initial list : " + list);
		
		// remove element at index 3 (true)
		list.remove(3); 
		// Now list is: [100, "welcome", 23.4, null] -> size is 4
		System.out.println("After removing index 3 : " + list);
		
		// Insert element in the middle (index 2)
		list.add(2, "Java"); 
		// Now list is: [100, "welcome", "Java", 23.4, null] -> size is 5
		System.out.println("After inserting element : " + list);
		
	    // Retrieving value at index 2
		System.out.println("Value at index 2: " + list.get(2)); // prints Java
		
		// Change the value at a valid index within range (index 4)
		list.set(4, "X"); 
		System.out.println("After changing the value: " + list);
		
		// contains (Case-sensitive check)
		System.out.println("Contains 'Java'? " + list.contains("Java")); // True
		System.out.println("Contains 'javaScript'? " + list.contains("javaScript")); // False
		
		// isEmpty
		System.out.println("Is list empty? " + list.isEmpty());
		
		// Standard for loop (Fixed to print values instead of indices)
		System.out.println("Reading elements using for loop:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); 
		}
				
		// for-Each loop
		System.out.println("Reading elements using for-each loop:");
		for(Object v : list) {
			System.out.println(v);
		}
		
		// Iterator loop (Fixed instantiation)
		System.out.println("Reading elements using Iterator:");
		Iterator<Object> itr = list.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
