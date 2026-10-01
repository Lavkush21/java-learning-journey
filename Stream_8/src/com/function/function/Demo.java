package com.function.function;

import java.util.function.Function;

public class Demo {
public static void main(String[] args) {
	Function<Integer, Integer> f = n -> n*n;
	System.out.println(f.apply(3));  // 9
	System.out.println(f.apply(4));  //  16
	System.out.println(f.apply(5)); // 25
	System.out.println(f.apply(6)); // 36
	System.out.println(f.apply(2)); // 4
	
			
}
}
