package com.tka.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.tka.service.BookService;

public class BookMain {
public static void main(String[] args) throws SQLException {
	Scanner sc=new Scanner(System.in);
	int choice=0,ch;
	do {
		System.out.println("1.Add book");
		System.out.println("2.Display book");
		System.out.println("3.Update book");
		System.out.println("4.Delete book");
		System.out.println("5.Fetch all book data");
		ch=sc.nextInt();
		switch(ch) {
		case 1:{
			BookService.addBook();
			break;
		}
		case 2:{
			BookService.displayBook();
			break;
		}
		case 3:	{
			BookService.updateBookCost();
			break;
		}
		case 4:{
			BookService.deleteBook();
			break;
		}
		case 5:{
			BookService.fetchData();
			break;
		}
		}
		System.out.println("enter 1 to continue else enter 0");
		choice=sc.nextInt();
	}while(choice==1);
}
}
