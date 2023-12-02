package com.Javabykiran.Thread;

public class ThreadOne extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			// Displaying the numbers from this thread
			System.out.println("Running First Thread :" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
	}

}
