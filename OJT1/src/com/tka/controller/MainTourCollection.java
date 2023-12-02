package com.tka.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.tka.collectionprg.TourData;
import com.tka.entity.Tour;

public class MainTourCollection {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch=0;
	do {
		System.out.println("1.Add Tour");
		System.out.println("2.Display all Tour");
		System.out.println("3.Search for a tour");
	    System.out.println("4.Update tour");
	    System.out.println("5.Delete tour");
	   int choice=sc.nextInt();
	    switch(choice) {
	    case 1:{
	    	System.out.println("Enter tid,tcost,tnm");
	    	TourData.insertTour(new Tour(sc.nextInt(),sc.nextInt(),sc.next()));
	    	break;
	    }
	    case 2:{
	    	ArrayList<Tour>l=TourData.getTour();
	    	System.out.println(l);
	    	break;
	    }
	    case 3:
	    {
	    	System.out.println("Enter tour to search");
	    	String tnm=sc.next();
	    	TourData.searchTour(tnm);
	    	break;
	    }
	    case 4:{
	    	System.out.println("Enter tour to update");
	    	String tnm=sc.next();
	    	TourData.updateTour(tnm);
	    	break;
	    }
	    case 5:{
	    	System.out.println("Enter tour to delete");
	    	String tnm=sc.next();
	    	TourData.deleteTour(tnm);
	    	break;
	    }
	    }
	    System.out.println("Enter 1 to continue else enter 0");
	    ch=sc.nextInt();
	}while(ch==1);
}
}
