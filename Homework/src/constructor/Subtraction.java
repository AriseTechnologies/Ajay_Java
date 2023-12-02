package constructor;

public class Subtraction {
	Subtraction(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Subtraction s = new Subtraction(12, 6);

	}
}
