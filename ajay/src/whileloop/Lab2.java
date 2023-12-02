package whileloop;
// WAP to read the no from command line and display the sum of

// individual digit of the given no.

public class Lab2 {
	public static void main(String[] args) {
		int n = 1234;
		int sum = 0;
		while (n != 0) {
			int r = n % 10;
			sum += r;
			n = n / 10;
		}
		System.out.println("sum=" + sum);
	}
}
