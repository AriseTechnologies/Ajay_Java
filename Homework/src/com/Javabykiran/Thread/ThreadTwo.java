package com.Javabykiran.Thread;

public class ThreadTwo extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Running Second Thread :" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
