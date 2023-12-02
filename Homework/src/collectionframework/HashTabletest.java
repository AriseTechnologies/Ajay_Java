package collectionframework;

import java.util.Hashtable;

public class HashTabletest {
public static void main(String[] args) {
	 Hashtable ht = new Hashtable();
	 ht.put("ind", "India");
	 ht.put("bhu", "Bhutan");
	 ht.put("ind", "India");
	 
	 // the below will print size of ht by ignoring duplicates key
	 
	 System.out.println("size of HashTable >"+ht.size());
	 System.out.println(ht.size());
}
}
