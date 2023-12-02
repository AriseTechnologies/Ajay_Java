package practice;

public class MyThread2 extends Thread {
	public void run() {
		int i=0;
		while(i<40000){
			System.out.println("My thread2 is running");
			System.out.println("She is preety");
			i++;
		}
	}
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
	}
}
