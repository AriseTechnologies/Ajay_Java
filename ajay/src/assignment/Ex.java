package assignment;

public class Ex {
	int sum=0;
	void sum (int num1, int num2) {
		if (num1%2==0 && num2%2!=0) {
			sum=num1+num2;
			System.out.println("The sum of num="+sum);
		}
		if (num1%2!=0 && num2%2==0) {
			sum=num1+num2;
			System.out.println("The sum of num="+sum);
		}
	}
	public static void main(String[] args) {
		Ex e=new Ex();
		e.sum(29,26 );
	}

}
