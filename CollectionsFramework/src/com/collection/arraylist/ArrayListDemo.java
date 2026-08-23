package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Welcome");
        al.add(100);
        al.add(35.56);
        al.add('A');
        al.add(true);
        
        System.out.println("all element print : " + al);
        
        // size
        System.out.println("Number of element in array list : " + al.size());
        
        // remove
        al.remove(3);
        System.out.println("After removing element from array list : " + al);
        
        // insert a new element
        al.add(2, "Java");
        System.out.println("After adding : " + al);
        
        // Retrieve specific element
        System.out.println("get of index value : " + al.get(3));
        
        // change element / replace
        al.set(2, "c#");
        System.out.println("After replaceing element : " + al);
        
        // search - contains() - Returns true / false
        System.out.println(al.contains("c#"));  // Fixed: Will print true
        System.out.println(al.contains("c++")); // Fixed: Will print false
        
        // isEmpty()
        System.out.println(al.isEmpty()); // false
        
        // for loop
        System.out.println("Reading elements using for loop....");
        for(int i = 0; i < al.size(); i++) { // Fixed: changed <= to <
            System.out.println(al.get(i));
        }
        
        // for... each loop
        System.out.println("Reading element for-each loop:");
        for(Object e : al) {
            System.out.println(e);
        }
        
        // iterator()
        System.out.println("Reading element in Iterator() : ");
        Iterator it = al.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
