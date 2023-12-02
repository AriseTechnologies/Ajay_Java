package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
public static void main(String[] args) {
	ArrayList a1 =new ArrayList();
	a1.add("aaa");
	a1.add("bbb");
	a1.add("ccc");
	// see return types of add below 
	System.out.println(a1.add("ddd"));
	a1.size();
	System.out.println(a1.size());
	// to check if ArrayList is empty
	a1.isEmpty();
	System.out.println("iteration of Arraylist by for loop");
	for (int i=0; i<a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("iteration of Arraylist by Iterator");
	Iterator itr = a1.iterator();
	while(itr.hasNext()) {
		Object o=itr.next(); //this is removed in jdk 1.5 and after by autoboxing
		String s= (String) o;
		System.out.println(s);
	}
	System.out.println("iteration of Arraylist by list Itearator");
	ListIterator ltr= a1.listIterator();
	while (ltr.hasNext()) {
		Object o=ltr.next();
		String s= (String )o;
		System.out.println(s);
		// Object op =ltr.previous();
		/*String prevStr=(String) op;
		System.out.println(prevStr);*/
		
	}
}
}
