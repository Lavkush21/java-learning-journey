package com.function.function;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {

      Function<String, Integer> f = s->s.length();
      
      System.out.println("Length is : " + f.apply("Welcome"));
      System.out.println("Length is : " + f.apply("Lavkush"));
	}

}
