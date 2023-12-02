package com.tka.collectionprg;

import java.util.TreeSet;

import com.tka.entity.Tour;

public class SetDemo  {
public static void main(String[] args) {
	TreeSet<Tour>tt=new TreeSet();
	tt.add(new Tour(1,111,"A"));
	tt.add(new Tour(2,222,"AA"));
	tt.add(new Tour(3,333,"AAA"));
	tt.add(new Tour(4,444,"AAAA"));
	System.out.println(tt);
	
}
}
