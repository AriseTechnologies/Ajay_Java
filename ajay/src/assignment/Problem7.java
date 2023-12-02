package assignment;

public class Problem7 {
	void x(int num1, int num2) {
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			int c = num1 + num2;
			System.out.println("sum of no=" + c);

			System.out.println("The no is Even");

		} else {
			System.out.println("The no is Odd");
		}

	}

	public static void main(String[] args) {
		Problem7 p = new Problem7();
		p.x(56, 24);
	}
}
