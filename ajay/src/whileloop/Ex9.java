package whileloop;

public class Ex9 {
	public static void main(String[] args) {
		int i=1;
		int num1 = 23,num2=12;
		int j;
		while(i<=1) {
			if (num1%2!=0 && num2%2==0) {
				j=num1+num2;
				System.out.println(j);
			}
			i++;
		}
		
	}

}
