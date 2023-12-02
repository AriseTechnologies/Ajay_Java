package practice;

public class MyThr4 extends Thread {
public void run() {
	int i=0;
	while(true) {
		System.out.println("Welcome");
		try {
			Thread.sleep(200);
		}catch(Exception e) {
			System.out.println(e);
		}
		i++;
	}
}
public static void main(String[] args) {
	MyThr3 t1=new MyThr3();
	MyThr4 t2=new MyThr4();
	//t1.setPriority(6);
	//t2.setPriority(7);
	System.out.println(t1.getPriority());	
	System.out.println(t2.getPriority());
	System.out.println(t1.getState());
	System.out.println(t2.getState());
	System.out.println(Thread.currentThread().getState());
	//t1.start();
	//t2.start();
}
}
