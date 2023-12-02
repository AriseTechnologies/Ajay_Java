package practice;

public class MyThreadRunnable1 implements Runnable {
public void run() {
	int i=0;
	while(i<20) {
		System.out.println("I am  running thread1");
        i++;
	}
}
}
