package com.tka.collectionprg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	
	// Printing ArrayList with object
	
	ArrayList<Integer>al=new ArrayList();
	al.add(10);
	al.add(1000);
	al.add(9);
	al.add(109);
	al.add(111);
	System.out.println(al); // Print integer in single bracket
	// Print Using for loop
	
	for(int i=0; i<al.size();i++)
		System.out.println(al.get(i));// printing the separate
	
	// Using for each loop
	
	for(Integer e:al)
		System.out.println(e);
	
	// iterator method
	
	Iterator<Integer>it=al.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	
	// for each() method
	
	al.forEach((e)->{System.out.println(e);});
	
	// use enumeration
	
	Enumeration e=Collections.enumeration(al);
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	
}
}
