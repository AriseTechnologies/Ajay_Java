package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class Settest {
public static void main(String[] args) {
	 HashSet hs =new HashSet();
	 hs.add("aaaa");
	 hs.add("bbbb");
	 
	 // aaaa will not be allowed as the set doesnot allow duplicates
	  
	 hs.add("aaaa");
	 hs.add("cccc");
	 
	 // see size
	 
	 System.out.println(hs.size());
	 
	 // we can print the values for testing
	 System.out.println(hs);
	 
	 // by using Iterator
	 
	 Iterator itr =hs.iterator();
	 while(itr.hasNext())
	 System.out.println(itr.next());
	 }
}
