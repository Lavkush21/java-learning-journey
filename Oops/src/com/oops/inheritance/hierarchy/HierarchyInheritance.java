package com.oops.inheritance.hierarchy;



class  Parent{
	
     void display(int a) 
     {
    	 System.out.println("Parent.display(): " + a);
     }
}
class Child1 extends Parent {
	void show(int b) {
		System.out.println("Parent.Child1.show(): " + b);
		
	}
}
class Child2 extends Parent 
{
	void print(int c) 
	
	{
		System.out.println("Parent.Child2.print(): " + c);
	}

}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
     Child1  ch = new Child1();
     ch.display(123);
     ch.show(321);
     
     
     Child2 ch1 = new Child2();
     ch1.print(321);
     ch1.display(324);
     
    		 
	}

}
