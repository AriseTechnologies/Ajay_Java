package practice;

import java.util.Scanner;

public class X {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		age =sc.nextInt();
		
		switch(age){
		case 18:
			System.out.println("you are going to adult");
			break;
			
		case 23:
			System.out.println("You are looking for job ");
			break;
			
			default:
			System.out.println("enjoy your life");
		
		}
		
	}
	

}
