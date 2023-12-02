package com.Javabykiran.Thread;

public class ThreadsA implements Runnable {
	Stack st = null;

	public ThreadsA(Stack st, String tname) {
		Thread t = new Thread(this, tname);
		this.st = st;
		t.start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			st.push(i);
			System.out.println(i + "is pushed by A");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
