package com.tka.collectionprg;

import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Tour;

public class TourData {
static Scanner sc=new Scanner(System.in);
static ArrayList<Tour>al=new ArrayList();

// Returning the arraylist

public static ArrayList getTour() {
	return al;
	
}
// Adding tour object into Arraylist
public static void insertTour(Tour t) {
	al.add(t);
}
public static void searchTour(String tnm) {
	int flg=0;
	for(Tour t:al) {
		if (t.getTournm().equals(tnm)) {
			System.out.println(t);
			flg=1;
			break;
		}
	}
	if(flg==0)
		System.out.println("tour does not exist");
}
public static void updateTour(String tnm) {
	for(Tour t:al) {
		if(t.getTournm().equals(tnm)) {
			System.out.println("Enter the tour cost to be updated");
			t.setTourcost(sc.nextInt());
			System.out.println("Tour cost updated");
			break;
		}
	}
}
public static void deleteTour(String tnm) {
	for(Tour t:al) {
		if(t.getTournm().equals(tnm)) {
			al.remove(t);
			break;
		}
	}
	System.out.println("Tour deleted");
}
}
