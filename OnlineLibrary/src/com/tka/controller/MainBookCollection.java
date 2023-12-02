package com.tka.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.tka.collectionprg.BookData;
import com.tka.entity.Book;

public class MainBookCollection {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch=0;
	do {
		System.out.println("1.Add Book");
		System.out.println("2.Display all Book");
		System.out.println("3.Search fo book");
		System.out.println("4.update book");
		System.out.println("5.Delete book");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter bid,bcost,bnm");
			BookData.insertBook(new Book(sc.nextInt(),sc.nextInt(),sc.next()));
			break;
		}
		case 2:{
			ArrayList<Book>b=BookData.getABook();
			System.out.println(b);
			break;
		}
		case 3:{
			System.out.println("Enter book to search");
			String bnm=sc.next();
			BookData.searchBook(bnm);
			break;
		}
		case 4:{
			System.out.println("Enter book to update");
			String bnm=sc.next();
			BookData.updateBook(bnm);
			break;
		}
		case 5:{
			System.out.println("Enter book to delete");
			String bnm=sc.next();
			BookData.deleteBook(bnm);
			break;
		}
		}
		System.out.println("Enter 1 to continue else enter 0)");
		ch=sc.nextInt();
		
	}while(ch==1);
}
}
