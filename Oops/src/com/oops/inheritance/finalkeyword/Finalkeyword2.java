package com.oops.inheritance.finalkeyword;

// Removed final from the class
class Test1 { 
    // Removed final from the method
    void m() { 
        System.out.println("Test1.m()"); 
    } 
} 

class Test2 extends Test1 { 
    @Override
    void m() { 
        System.out.println("Test2.m()"); 
    } 
} 

public class Finalkeyword2 { 
    public static void main(String[] args) { 
        Test1 obj = new Test2();
        obj.m(); // Outputs: Test2.m()
    } 
}
