package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.Book;
import com.tka.exceptionclass.BookNameException;
import com.tka.service.BookData;

public class MenuDrivenBook {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0,ch,n=0;
	do {
		System.out.println("1.Add Book");
		System.out.println("2.Display Book");
		System.out.println("3.Add n Book");
		System.out.println("4.Display n Book");
		System.out.println("5.Search Book");
		ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter id,cost,nm");
			try {
				int id=sc.nextInt();
				int cost=sc.nextInt();
				String nm=sc.next();
				if(! nm.startsWith("BK"))
				throw new BookNameException("Invalid book title.Title must be start with BK");
			
				else
					BookData.addBook(new Book(sc.nextInt(),sc.nextInt(),sc.next()));
			}
			catch(BookNameException e) {
				System.out.println(e.getMessage());
			}
			break;
		}
		case 2:{
			System.out.println(BookData.getBook());
			break;
		}
		case 3:{
			System.out.println("Enter how many book");
			n=sc.nextInt();
			Book b1arr[]=new Book[n];
			for(int i=0;i<n;i++) {
				System.out.println("ENter id,cost,nm");
				b1arr[i]=new Book(sc.nextInt(),sc.nextInt(),sc.next());
			}
			BookData.addNBook(b1arr);
			break;
		}
		case 4:{
			Book b[]=new Book[n];
			b=BookData.getNBook();
			for(int i=0;i<n;i++) {
				System.out.println(b[i]);
			}
			break;
		}
		case 5:{
			boolean flg=BookData.search();
			if(flg==false)
				System.out.println("Record not found");
		
		}
		}
		System.out.println("ENter 1 to continue else enter 0");	
		choice=sc.nextInt();	
	}while(choice==1);

	}
}

