package assignment;

public class Problem8 {
	void x(int num1, int num2) {
		if (num1 % 2 != 0 && num2 % 2 != 0) {
			int c = num1 + num2;
			System.out.println("Num is odd");

			System.out.println("Sum of num=" + c);
		} else {
			System.out.println("Num is Even");
		}

		
	}

	public static void main(String[] args) {
		Problem8 p = new Problem8();
		p.x(24, 25);
	}
}
