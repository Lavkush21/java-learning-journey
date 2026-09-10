package com.collection.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDedmo {

	public static void main(String[] args) {
	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	
	ht.put(101, "Ashish");
	ht.put(102, "Rohit");
	ht.put(103, "Rohan");
	// ht.put(104, null); // NullPointerException
	
System.out.println("HashTableDedmo.main() : " + ht);
	
System.out.println("Get value : " + ht.get(103));
ht.remove(103);
System.out.println("Remove : " + ht);

System.out.println("Containsa key : " + ht.contains(102)); // true
System.out.println("Containsa key : " + ht.contains(103)); // false
System.out.println("isEmpty: " + ht.isEmpty());

System.out.println();
System.out.println("KeySet: " + ht.keySet());
System.out.println();
System.out.println("Values: " + ht.values());


for(Object k: ht.keySet()) {
	System.out.println("Object k : " + k + " " + ht.get(k));
	
}
// Entry specific methods::
for(Map.Entry entry : ht.entrySet()) {  // (key ,value)
	System.out.println(entry.getKey()+" "+entry.getValue());
	
	System.out.println();
	
}
// iterator methods::
Set s = ht.entrySet();
Iterator itr = s.iterator();
while(itr.hasNext()) {
	Map.Entry entry = (Entry) itr.next();
	System.out.println(entry.getKey()+" "+entry.getValue());
}


	}

}
