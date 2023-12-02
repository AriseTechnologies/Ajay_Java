package com.Javabykiran.Thread;

public class ThreadC {
	public static void main(String[] args) {
		Stack st=new Stack();
		ThreadsA a=new ThreadsA(st,"A");
		ThreadsB b=new ThreadsB(st,"B");
			for (int i=1; i<=5; i++) {
				System.out.println(i+"by");
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					
				}
			}
	}

}
