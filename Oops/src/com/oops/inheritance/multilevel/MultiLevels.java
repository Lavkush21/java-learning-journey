package com.oops.inheritance.multilevel;
class A {
	int a;
	void display() {
		System.out.println("A.display() : " + a);
	}
}
	class B extends A {
		int b;
		void show() {
		System.out.println("A.display() : " + b);
	}
	}
	class C extends B {
		int c;
		void print() {
			System.out.println("A.display() : " + c);
	}
}
public class MultiLevels {

	public static void main(String[] args) {
		C  obj = new C();
		obj.a = 100;
		obj.b = 200;
		obj.c = 300;
		obj.display();
		obj.show();
		obj.print();

	}

}
