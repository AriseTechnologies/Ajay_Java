package com.tka.collectionprg;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeCount {
public static void main(String[] args) {
	HashMap<Character,Integer>hm=new HashMap();
	int n=0;
	do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade");
		String grade=sc.next();
		int i=0;
		while(i<grade.length()) {
			char ch=grade.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
			i++;
		}
		System.out.println("Enter 1 to continue else enter 0");
		n=sc.nextInt();
	}while(n==1);
	System.out.println(hm);
}
}
