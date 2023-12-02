package assignment;

public class Ex6 {
public static void main(String[] args) {
	int sum=0;
	for(int i=1; i<=4; i++) {
		if (i%2==0) {
			sum=sum+i;
		}
	}
	System.out.println("The sum of Even num="+sum);
}
}
