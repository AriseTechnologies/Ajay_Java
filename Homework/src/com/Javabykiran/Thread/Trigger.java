package com.Javabykiran.Thread;

public class Trigger {
public static void main(String[] args) throws InterruptedException {
	
	for(int i=1; i<=10; i++) {
		System.out.println("Kalyani");
	}
	Job jb=new Job();
	Thread t=new Thread(jb);
	t.setPriority(5);
	
	for(int i=1; i<=10; i++) {
		Thread.sleep(500);
		System.out.println("Sagar");
	}
}
}
