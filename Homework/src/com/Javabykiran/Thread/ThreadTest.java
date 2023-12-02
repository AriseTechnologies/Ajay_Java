package com.Javabykiran.Thread;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "Thread Begin...");
		ThreadOne firstThread = new ThreadOne();
		ThreadTwo secondThread = new ThreadTwo();
		firstThread.start();
		secondThread.start();
	}
}
