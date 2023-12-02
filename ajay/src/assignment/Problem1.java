package assignment;

import java.util.Scanner;

public class Problem1 {
	void x(int num) {
		
		if (num % 2 == 0) {
			System.out.println("The no is Even");
		} else {
			System.out.println("The no is odd");
		}
	}

	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.x(26);
	}
}
