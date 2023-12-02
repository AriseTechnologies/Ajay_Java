package practice;

public class MyThread1 extends Thread  {
public void run() {
	int i=0;
	while(i<40000) {
		System.out.println("My therad1 is running");
		System.out.println("I am good");
		i++;
	}
}
}

