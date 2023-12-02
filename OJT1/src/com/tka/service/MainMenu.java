package com.tka.service;

import java.util.Scanner;

import com.tka.entity.Tour;

public class MainMenu {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0, ch;//n=0;
	do {
		System.out.println("1.AddTour");
		System.out.println("2.Display Tour");
		ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter id,cost,nm");
			TourData.addTour(new Tour(sc.nextInt(),sc.nextInt(),sc.next()));
			break;
		}
		case 2:{
			System.out.println(TourData.getTour());
			break;
		}
		}
		System.out.println("Enter 1 to continue else enter 0");
		choice=sc.nextInt();
	}while(choice==1);
}
}
