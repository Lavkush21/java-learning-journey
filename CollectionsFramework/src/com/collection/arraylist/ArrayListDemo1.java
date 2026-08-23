package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); //  Added String generic type
		
		list.add("x");
		list.add("y");
		list.add("z");
		list.add("k");
		list.add("l");
		list.add("m");
		list.add("n");
		list.add("s");
		
		ArrayList<String> al_dup = new ArrayList<>();
		al_dup.addAll(list);
		System.out.println("ArrayListDemo1.main() : " + al_dup);
		
		al_dup.removeAll(list);
		System.out.println("After remove : " + al_dup); // Will print empty brackets []
		
		// sort --- Collections.sort
		System.out.println("element in the array list : " + list);
		Collections.sort(list);
		System.out.println("Element in the array after sorting :" + list);
		

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Element in the array after sorting descending : " + list);
		
		// Shuffling the list randomly
		Collections.shuffle(list);
		System.out.println("Element in the array after shuffling : " + list);
	}
}
