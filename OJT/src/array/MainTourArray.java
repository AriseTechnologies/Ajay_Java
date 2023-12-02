package array;

import java.util.Scanner;

public class MainTourArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=0;
	System.out.println("Enter the no of tour");
	n=sc.nextInt();
	Tour t[]=new Tour[n];
	
	for (int i=0; i<n;i++) {
		System.out.println("Enter tid,tcost,tnm");
		int tid=sc.nextInt();
		int tcost=sc.nextInt();
		String tnm=sc.next();
		// Using parameterized constructor
		//t[i]=new Tour(tid,tcost,tnm);
		t[i]=new Tour();
		t[i].setTourid(tid);
		t[i].setTourcost(tcost);
		t[i].setTournm(tnm);
	}
	for (int i=0; i<n;i++) {
		System.out.println(t[i].getTourid());
		System.out.println(t[i].getTourcost());
		System.out.println(t[i].getTournm());
	}
}
}
