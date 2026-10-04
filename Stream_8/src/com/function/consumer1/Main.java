package com.function.consumer1;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("Lavkush");

	}

}
