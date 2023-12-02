package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
public static void main(String[] args) {
	 
	// Creation of hashmap
	LinkedHashMap hm=new LinkedHashMap();
	
	// Adding elements with key
	
	hm.put("101", "java");
	hm.put("102", ".Net");
	
	// with print null
	
	Object o =hm.put("103","C++");
	System.out.println(o);
	
	// will print previous value as it is duplicates
	
	Object o1 =hm.put("103", "C");
	System.out.println(o1);
	
	// Retrieving elements from hashmap by using iterator
	
	System.out.println("====By using Iterator====");
	Set s= hm.keySet(); // set s contains all keys
	Iterator itr= s.iterator();
	while(itr.hasNext()) {
		String key =(String) itr.next();
		System.out.println("key :"+key);
		System.out.println("Value :"+hm.get(key));
		
	}
	// Retrieving elements from HasMap by using Map.Entry
	
	System.out.println("==== By using Map.Entry====");
	
	// Get a set of the entries
	Set set =hm.entrySet();
	
	// get an Iterator 
	Iterator it =set.iterator();
	
	//Display elements 
	while(it.hasNext()) {
		Map.Entry me= (Map.Entry) it.next();
		System.out.println(me.getKey() +": ");
		System.out.println(me.getValue());
	}
}
}
