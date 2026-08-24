package com.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet<>();  // default capacity 16 Load factor 0.75
		hs.add(100);
		hs.add(12.3);
		hs.add("Ashish");
		hs.add(true);
		hs.add('A');
		hs.add(null);
		
		System.out.println("HashSetDemo1.main() : " + hs); // Insertion order not preserved
		
		
		// remove()
		
		hs.remove(12.3);
		
		System.out.println("Remove the element : " + hs);  // [null, A, 100, Ashish, true]
		
		// contains
		
		hs.contains("Ashish");
		hs.contains("hsdbfwbf");
		System.out.println("Exist the value true : " + hs);
		System.out.println("Exist the value true : " + hs);
		
		System.out.println("isEmpty : " + hs.isEmpty());
		
		
		// Reading objects for -Each -loop
		for(Object e : hs) {
			System.out.println(e);
		}
		
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}

}
