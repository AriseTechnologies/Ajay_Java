package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class Collectiontest {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("java by kiran");
	al.add("by");
	al.add("kiran");
	al.add("zudio");
	al.add("Ajay");
	Collections.reverse(al);

	System.out.println(al);
	//System.out.println("Before sorting "+al);
	//System.out.println("After sorting"+al);
	
	// to make Arraylist object syncronised
	//Collections.synchronizedList(al);
}
}
