package practice;

public class MyThr2 extends Thread{
public void run() {
	while(true) {
		System.out.println("My thank you");
        
	}
}
public static void main(String[] args) {
	MyThr1 t1=new MyThr1();
	MyThr2 t2=new MyThr2();
	t1.start();
	//try {
	//	t1.join();
	//}catch(Exception e) {
	//	System.out.println(e);
	//}
	t2.start();
}
}
