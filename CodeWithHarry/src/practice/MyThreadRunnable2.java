package practice;

public class MyThreadRunnable2 implements Runnable{
public void run() {
	int i=0;
	while(i<20) {
		System.out.println("I am running thread2");
		i++;
	}
}
public static void main(String[] args) {
	MyThreadRunnable1 run1=new MyThreadRunnable1();
	Thread t1=new Thread(run1);
	MyThreadRunnable2 run2=new MyThreadRunnable2();
	Thread t2=new Thread(run2);
	t1.start();
	t2.start();
}
}
