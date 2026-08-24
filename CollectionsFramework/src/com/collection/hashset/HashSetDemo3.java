package com.collection.hashset;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        // Base sets
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1); 
        set1.add(2); 
        set1.add(3); set1.add(4); 
        set1.add(5); set1.add(6);
        System.out.println("Set 1: " + set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5); 
        set2.add(2); 
        set2.add(6); 
        set2.add(1);
        System.out.println("Set 2: " + set2);

        // 1. Union (Combine elements from both sets)
        HashSet<Integer> unionSet = new HashSet<>(set1); // Copy set1
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        // 2. Intersection (Keep only common elements)
        HashSet<Integer> intersectionSet = new HashSet<>(set1); // Copy set1
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);

        // 3. Difference (Elements in set1 but NOT in set2)
        HashSet<Integer> differenceSet = new HashSet<>(set1); // Copy set1
        differenceSet.removeAll(set2);
        System.out.println("Difference: " + differenceSet);

        // 4. Subset (Check if set2 is entirely inside set1)
        boolean isSubset = set1.containsAll(set2);
        System.out.println("Is Set 2 a subset of Set 1?: " + isSubset);
    }
}
