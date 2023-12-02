package com.tka.collectionprg;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	
	// using Linkedlist as a object
	LinkedList<Integer> li=new LinkedList();
	li.add(10);
	li.add(102);
	li.add(111);
	li.add(1111);
	System.out.println(li);
	
	// use for loop
	
	for(int i=0; i<li.size();i++)
		System.out.println(li.get(i));
	
	// for each loop
	
	for(Integer e:li)
		System.out.println(e);
	
	// using Iterator
	
	Iterator<Integer>it=li.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	
	//for each method
	
	li.forEach((e)->{System.out.println(e);});
	
	// using Enumeration method
	Enumeration e=Collections.enumeration(li);
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
	
}
}
