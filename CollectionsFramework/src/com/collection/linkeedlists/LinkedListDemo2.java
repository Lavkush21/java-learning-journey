package com.collection.linkeedlists;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Ashish");
		list.add("Rohit");
		list.add("Shivam");
		list.add("Rohan");
		list.add("Roshan");
		list.add("Lavksuh");
		list.add("Deepak");
		list.add("Arjun");
		
		LinkedList<String> new_list = new LinkedList<>();
		new_list.addAll(list);
		System.out.println("Duplicate list contents: " + new_list);
		
		new_list.removeAll(list);
		System.out.println("Duplicate list after removeAll: " + new_list); // Prints []
		
		// 1. Natural Alphabetical Sort (A to Z)
		System.out.println("Original list before sorting: " + list);
		Collections.sort(list); 
		System.out.println("After sorting (A-Z) : " + list); 
		
		// 2. Reverse Order Sort (Z to A)
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("After sorting in reverse order (Z-A) : " + list);
		
		// : Shuffling the populated 'list' instead of empty 'new_list'
		Collections.shuffle(list);
		System.out.println("After shuffling randomly : " + list);
	}
}
