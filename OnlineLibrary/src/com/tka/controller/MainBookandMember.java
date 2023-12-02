package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.Book;
import com.tka.entity.Member;

public class MainBookandMember {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=0;
	System.out.println("Enter the n number of books and member");
	n=sc.nextInt();
	Book b[]=new Book[n];
	Member m[]=new Member[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter bookid,bookcost,booknm");
		int bookid=sc.nextInt();
		int bookcost=sc.nextInt();
		String booknm=sc.next();
		b[i]=new Book();
		b[i].setBookid(bookid);
		b[i].setBookcost(bookcost);
		b[i].setBooknm(booknm);	
}
	for(int i=0;i<n;i++) {
		System.out.println(b[i].getBookid());
		System.out.println(b[i].getBookcost());
		System.out.println(b[i].getBooknm());
	}
	
	for(int i=0;i<n;i++) {
		System.out.println("Enter memberid,membernm");
		int memberid=sc.nextInt();
		String membernm=sc.next();
		
		m[i]=new Member();
		m[i].setMemberid(memberid);
		m[i].setMembernm(membernm);
		
	}
	for(int i=0;i<n;i++) {
		System.out.println(m[i].getMemberid());
		System.out.println(m[i].getMembernm());
	}
}
}