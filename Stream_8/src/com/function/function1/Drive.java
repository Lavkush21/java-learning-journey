package com.function.function1;

import java.util.function.Function;

public class Drive {

	public static void main(String[] args) {
     Function<String, Integer> s = n->n.length();
    
         System.out.println("Function length is : " + s.apply("Lavkush"));
	}

}
