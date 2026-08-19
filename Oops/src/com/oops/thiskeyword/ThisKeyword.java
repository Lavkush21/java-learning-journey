package com.oops.thiskeyword;

public class ThisKeyword {
         int x, y;  // class variable / instance variables

         ThisKeyword(int a, int b){
        	 x = a;
        	 y = b;
         }
         void display() {
        	 System.out.println("ThisKeyword.display(): " + x);
        	 System.out.println("ThisKeyword.display(): " + y);
         }
         
	public static void main(String[] args) {
		 ThisKeyword th = new  ThisKeyword(100, 400);
		 th.display();

	}

}
