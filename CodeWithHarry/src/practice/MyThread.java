package practice;

public class MyThread extends Thread {
public MyThread(String name) {
	super(name);
}
public void run() {
	int i=34;
	System.out.println("Thank You");
//	while(true) {
//		System.out.println("I am the thread");
	//}
}
public static void main(String[] args) {
	MyThread t=new MyThread("Ajay");
	t.start();
	System.out.println("The id of thread t is="+t.getId());
	System.out.println("The name of thread t is="+ t.getName());
}
}
