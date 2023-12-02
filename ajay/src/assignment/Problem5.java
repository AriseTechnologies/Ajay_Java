package assignment;

public class Problem5 {
	void x(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("num2 is the smallest no");
		} else {
			System.out.println("num1 is the smallest no");
		}
	}

	public static void main(String[] args) {
		Problem5 p = new Problem5();
		p.x(281, 387);
	}
}
