package loop;

//WAP to read the number from the command line and display the sum of 
//individual digits of the given number.

public class Lab3 {
	public static void main(String[] args) {
		int n = 12345;
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			n = n / 10;
		}
		System.out.println("Sum=" + sum);

	}
}
