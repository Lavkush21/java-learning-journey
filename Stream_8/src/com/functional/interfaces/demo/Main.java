package com.functional.interfaces.demo;



interface Lavkush {
	public void village(String name, int age, int phone);
	
}

class  Home implements Lavkush {
	public void village(String name, int age, int phone) {
		System.out.println("Home.village() : " + name + " : " + age + " : " + phone);
	}
}
public class Main {

	public static void main(String[] args) {
        Lavkush g = new Home();
        g.village("Lavkush", 23, 91);

	}

}
