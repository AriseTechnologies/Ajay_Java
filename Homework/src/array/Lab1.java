package array;

//  Program to find max no.

public class Lab1 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[4]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if ((a > b) && (a > c)) {
			System.out.println("max" + a);
		} else if (b > c) {
			System.out.println("max" + b);

		} else {
			System.out.println("max" + c);
		}

	}
}
