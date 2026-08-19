package com.oops.inheritance.overriding;


class Bank 
{
	double roi()
	
	{
		return 0;
	}
}

class ICICI extends Bank
{
double roi()
	
	{
		return 10.5;
	}
	
}

class SBI extends Bank 
{
double roi()
	
	{
		return 12.4;
	}
}
public class Overridings {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.roi();

	}

}
