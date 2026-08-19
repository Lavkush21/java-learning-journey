package com.oops.inheritance.types;


class A 

{
	int a = 100;
	void display()
	
	{
		System.out.println("A.display() : " + a);
	}
}
class B extends A

{
	int b = 200;
	void show()
	
	{
		System.out.println("B.show() : " + b);
	}
}
public class InheritanceTypes {

	public static void main(String[] args) {
		 B  b = new  B();
		 System.out.println(b.a);
		 System.out.println(b.b);
		 b.display();
		 b.show();
	}

}
