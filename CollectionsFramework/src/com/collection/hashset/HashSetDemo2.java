package com.collection.hashset;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(10);
		evenNumber.add(12);
		evenNumber.add(14);
		System.out.println("HashSetDemo2.main() : " + evenNumber);
		
		
		HashSet<Integer> number = new HashSet<>();
		number.addAll(evenNumber);
		number.add(10);
		number.add(12);
		number.add(21);
		System.out.println("HashSetDemo2.main() : " + number);

	}

}
