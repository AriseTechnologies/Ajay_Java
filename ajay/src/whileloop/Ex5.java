package whileloop;

public class Ex5 {
public static void main(String[] args) {
	int sum=0;
	int i=1;
	while(i<=50) {
		if (i%2!=0) {
			sum=sum+i;
		
		}
		i++;
	}
	System.out.println("The sum of odd no="+sum);
    
}
}
