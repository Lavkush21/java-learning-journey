package com.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1. Initializing HashMap with Generics
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(101, "ashish");
        hm.put(102, "shivam");
        hm.put(103, "rohit");
        hm.put(104, "rohan");

        // 2. Basic Operations
        System.out.println("Main.main() : " + hm);
        System.out.println("Main.main() get : " + hm.get(101));
        
        hm.remove(104);
        System.out.println("Main.main() remove : " + hm);
        
        System.out.println("Main.main() contains true ! false : " + hm.containsKey(101));
        System.out.println("Main.main() contains key : " + hm.containsKey(104));
        System.out.println("Main.main() value : " + hm.containsValue("ashish"));
        System.out.println("Main.main() value : " + hm.containsValue("rohit"));
        System.out.println("Main.main() : " + hm.isEmpty());
        
        // 3. Displaying Views
        System.out.println("Keys: " + hm.keySet());
        System.out.println("Values: " + hm.values());
        System.out.println("Entries: " + hm.entrySet());

        // 4. Iterating using keySet (Enhanced For Loop)
        System.out.println("\n--- Iterating via KeySet ---");
        for (Integer i : hm.keySet()) {
            System.out.println(i + " " + hm.get(i));
        }

        // 5. Iterating using values 
        System.out.println("\n--- Iterating via Values ---");
        for (String value : hm.values()) {
            System.out.println(value);
        }

        // 6. Iterating using entrySet
        System.out.println("\n--- Iterating via EntrySet Loop ---");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 7. Iterating using Iterator 
        System.out.println("\n--- Iterating via Iterator ---");
        Set<Map.Entry<Integer, String>> s = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = s.iterator();
        
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
