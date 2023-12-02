package com.tka.service;

import java.util.Scanner;

import com.tka.entity.Member;

public class Memberdata {
static Member m=null;
static Member marr[]=null;

public static void addMember(Member m) {
	m=new Member(m.getMemberid(),m.getMembernm());
}
public static Member getMember() {
	return m;
}
public static void addNMember(Member[] m) {
	marr=new Member[m.length];
	for(int i=0;i<marr.length;i++) {
		marr[i]=new Member(m[i].getMemberid(),m[i].getMembernm());
	}
}
public static Member[] getNMember() {
	return marr;
	
}
public static boolean search() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the member to be search");
	String nm=sc.next();
	boolean flg=false;
	for(int i=0;i<marr.length;i++) {
		if(marr[i].getMembernm().equals(nm)) {
			System.out.println(marr[i]);
			flg=true;
			break;
		}
	}
	return flg;
}
}
