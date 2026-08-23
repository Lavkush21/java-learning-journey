package com.collection.linkeedlists;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        // Good practice: Enforce type safety using <String> generics
        LinkedList<String> l = new LinkedList<>();
        l.add("Dog");
        l.add("Cat");
        l.add("horse");
        l.add( "Cat");
        System.out.println("Initial LinkedList : " + l);
        
        // Inserting at special positions
        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println("After addFirst & addLast: " + l);
        
        // Retrieving head and tail values
        System.out.println("First Element: " + l.getFirst()); // Prints Tiger
        System.out.println("Last Element: " + l.getLast());   // Prints Elephant
        
        // Removing head and tail values
        l.removeFirst();
        l.removeLast();
        
        // Added: Verification print to confirm removals worked perfectly
        System.out.println("Final LinkedList after removals: " + l);
    }
}
