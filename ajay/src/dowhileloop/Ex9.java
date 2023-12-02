package dowhileloop;
// WAP to print sum of odd and even no.

public class Ex9 {
	public static void main(String[] args) {
		int i=1;
		int num1=25, num2=24;
		int sum;
		do {
			if (num1%2!=0 && num2%2==0) {
				sum=num1 +num2;
				System.out.println(sum);

			}i++;
		}while(i<=1);
	}

	}

