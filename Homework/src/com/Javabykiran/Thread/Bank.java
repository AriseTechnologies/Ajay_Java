package com.Javabykiran.Thread;

public class Bank extends Thread {
	private static int balance=1000;
//@Override

	public void run(){
		for(int i=0;i<5;i++) {
			withdraw(150);
		}
		
	}
	private static synchronized  void withdraw(int amt) {
		if(balance>150) {
			System.out.println(Thread.currentThread().getName());
			
			balance =balance-amt;
			System.out.println("Remaining bal="+balance);
		}else {
			System.out.println("Insufficient Balance");
		}
	}

}
