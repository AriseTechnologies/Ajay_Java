package com.tka.collectionprg;

import java.util.TreeSet;

import com.tka.entity.Tour;

public class ProductMain {
public static void main(String[] args) {
	TreeSet <Tour>t=new TreeSet(new SortOnPrice());
	t.add(new Tour(1,2000,"Riya"));
	t.add(new Tour(2,4000,"Anay"));
	TreeSet<Tour>t1=new TreeSet(new SortOnName());
	t.add(new Tour(1,5000,"Riya"));
	t.add(new Tour(2,3000,"Ajay"));
	System.out.println(t);
	System.out.println(t1);
}
}
