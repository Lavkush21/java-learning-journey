package com.oops.inheritance.finalkeyword;

class Test {
	int x = 100;
}
public class FinalKeyword {
public static void main(String[] args) {
	Test t = new Test();
	t.x = 200;
	System.out.println("FinalKeyword.main() : " + t.x);
}
}
