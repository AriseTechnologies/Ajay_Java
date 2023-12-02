package practice;

public class MyThr1  extends Thread{
public void run() {
	int i=0;
	while(true) {
		System.out.println("Thank you");
		try {
			Thread.sleep(400);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		i++;
	}
}
}
