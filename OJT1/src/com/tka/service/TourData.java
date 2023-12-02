package com.tka.service;

import java.util.Scanner;

import com.tka.entity.Tour;

public class TourData {
	
	static Tour t1=null;
	static Tour tarr[]=null;
	
	
	// Passing object as a parameter
	
	public static void addTour(Tour t) {
		t1=new Tour(t1.getTourid(),t1.getTourcost(),t1.getTournm());
	}
	
	// Object as a returning parameter
	
	public static Tour getTour() {
		return t1;
		
	}
	// Array object as a passing parameter
	
	public static void addNTour(Tour[]t) {
		tarr=new Tour[t.length];
		for(int i=0;i<tarr.length;i++) {
			tarr[i]=new Tour(t[i].getTourid(),t[i].getTourcost(),t[i].getTournm());
		}
		
	}
	// Array as a returning parameter
	
	public static Tour[] getNTour() {
		return tarr;
		
	}
	public static boolean search() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tour to be searched");
		String nm=sc.next();
		boolean flg=false;
		for(int i=0; i<tarr.length;i++) {
			if(tarr[i].getTournm().equals(nm)) {
				System.out.println(tarr[i]);
				flg=true;
				break;
			}
		}
		return flg;
		
	}
}

