package com.tka.controller;

import java.util.Scanner;

import com.tka.entity.Member;
import com.tka.service.Memberdata;

public class MenuDrivenMember {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0,ch,n=0;
	do {
		System.out.println("1.Add Member");
		System.out.println("2.Display Member");
		System.out.println("3.Add n Member");
		System.out.println("4.Display n member");
		System.out.println("5.Search member");
		ch=sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Enter id,nm");
			Memberdata.addMember(new Member(sc.nextInt(),sc.next()));
			break;
		}
		case 2:{
			System.out.println(Memberdata.getMember());
			break;
		}
		case 3:{
			System.out.println("Enter how many member");
			n=sc.nextInt();
			Member m1arr[]=new Member[n];
			for(int i=0;i<n;i++) {
		      m1arr[i]=new Member(sc.nextInt(),sc.next());
			}
			Memberdata.addNMember(m1arr);
			break;
		}
		case 4:{
			Member m[]=new Member[n];
			m=Memberdata.getNMember();
			for(int i=0;i<n;i++)
			{
				System.out.println(m[i]);
			}
			break;
		}
		case 5:{
			boolean flg=Memberdata.search();
			if(flg==false)
				System.out.println("Record not found");
		}
		}
		System.out.println("Enter 1 to continue else enter 0");
		ch=sc.nextInt();
	}while(choice==1);
}
}
