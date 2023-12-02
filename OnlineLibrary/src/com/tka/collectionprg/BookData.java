package com.tka.collectionprg;

import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Book;

public class BookData {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> al = new ArrayList();

// returning the arraylist
	public static ArrayList getABook() {
		return al;

	}

// Adding the book object into the arraylist
	public static void insertBook(Book b) {
		al.add(b);
	}

	public static void searchBook(String bnm) {
		int flg = 0;
		for (Book b : al) {
			if (b.getBooknm().equals(bnm)) {
				System.out.println(b);
				flg = 1;
				break;
			}
		}
		if (flg == 0)
			System.out.println("Book does not exist");
	}

	public static void updateBook(String bnm) {
		for (Book b : al) {
			if (b.getBooknm().equals(bnm)) {
				System.out.println("Enter the book cost to be updated");
				b.setBookcost(sc.nextInt());
				System.out.println("Book cost to be updated ");
				break;
			}
		}
	}
   public static void deleteBook(String bnm) {
	   for(Book b:al) {
		   if(b.getBooknm().equals(bnm)) {
			   al.remove(b);
			   break;
		   }
	   }
	   System.out.println("Book deleted");
   }
}
