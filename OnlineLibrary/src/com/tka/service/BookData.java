package com.tka.service;

import java.util.Scanner;

import com.tka.entity.Book;


public class BookData {
static Book b=null;
static Book barr[]=null;

public static void addBook(Book b) {
	b=new Book(b.getBookid(),b.getBookcost(),b.getBooknm());
}
public static Book getBook() {
	return b;
	
}
public static void addNBook(Book[]b) {
	barr=new Book[b.length];
	for(int i=0;i<b.length;i++) {
		barr[i]=new Book(b[i].getBookid(),b[i].getBookcost(),b[i].getBooknm());
	}
}
public static Book[] getNBook() {
	return barr;
	
}
public static boolean search() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the book to be search");
	String nm=sc.next();
	boolean flg=false;
	for(int i=0; i<barr.length;i++) {
		if(barr[i].getBooknm().equals(nm)) {
			System.out.println(barr[i]);
			flg=true;
			break;
		}
	}
	return flg;
}
}
