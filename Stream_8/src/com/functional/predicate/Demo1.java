package com.functional.predicate;

import java.util.function.Predicate;

public class Demo1 {
public static void main(String[] args) {
	Predicate<String>pr = s->(s.length() > 4);
    System.out.println(pr.test("welcome")); // true
    System.out.println(pr.test("xyz")); // false
}
}
