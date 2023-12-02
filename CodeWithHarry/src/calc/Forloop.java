package calc;

public class Forloop {
public static void main(String[] args) {
	
	for(int i=1;i<=25;i++) {
		System.out.println(i);
	}
	System.out.println("Reverse the no from 25 to 1");
	for(int i=25;i>=1;i--) {
		System.out.println(i);
	}
	System.out.println("Even no from 1 to 25");
	for(int i=1;i<=25;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
}
