package assignment;

public class Problem4 {
	void x(int num) {
		if (num > 0) {
			System.out.println("The num is positive");
		} else if (num < 0) {
			System.out.println("The num is negative");
		} else {
			System.out.println("The num is zero");
		}
	}

	public static void main(String[] args) {
		Problem4 p = new Problem4();
		p.x(-5);
	}
}
