package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class Vectortest {
public static void main(String[] args) {
   Vector v=new Vector();
   System.out.println(v.size());
   System.out.println(v.capacity());
   // we can change its default
    Vector v1= new Vector(2);
    System.out.println(v1.size());
    System.out.println(v1.capacity());
    // now try adding elements 
    v1.add("apple");
    v1.add("mango");
    v1.add("grapes");
    System.out.println(v1.size());
    // observe capacity System.out.println(v1.capacity());
    // Iterate by using Enumeration Enumeration
    Enumeration enumeration = v1.elements();
    while(enumeration.hasMoreElements()) {
    	String element= (String)enumeration.nextElement();
    	System.out.println(element);
    }
}
}
