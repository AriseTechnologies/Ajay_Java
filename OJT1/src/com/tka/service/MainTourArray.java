package com.tka.service;

import java.util.Scanner;

import com.tka.entity.Tour;

public class MainTourArray {
public static void main(String[] args) {
	
	// For specific number of tour
	
   /*  Scanner sc=new Scanner(System.in);
	Tour t[]=new Tour [2];
	
	for(int i=0;i<t.length;i++) {
		System.out.println("Enter the tid,tcost,tnm");
		int tid=sc.nextInt();
		int tcost=sc.nextInt();
		String tnm=sc.next();
		
		t[i]=new Tour();
	//	t[i].setTourid(tid);
	//	t[i].setTourcost(tcost);
	//	t[i].setTournm(tnm);
		
		//Using parameterized constructor
		 t[i]=new Tour(tid,tcost,tnm);
	}*/
	
	// For n number of tour
	
	Scanner sc =new Scanner (System.in);
	int n=0;
	System.out.println("Enter the n no of tour");
	n=sc.nextInt();
	Tour t[]=new Tour[n];
	
	for(int i=0; i<n;i++) {
		System.out.println("Enter tid,tcost,tnm");
		int tid=sc.nextInt();
		int tcost=sc.nextInt();
		String tnm=sc.next();
		
		t[i]=new Tour();
		t[i].setTourid(tid);
		t[i].setTourcost(tcost);
		t[i].setTournm(tnm);
		
		// using parameterized constructor
	//	t[i]=new Tour(tid,tcost,tnm);
		
	}
	for(int i=0; i<n;i++) {
		System.out.println(t[i].getTourid());
		System.out.println(t[i].getTourcost());
		System.out.println(t[i].getTournm());
	}
}
}
