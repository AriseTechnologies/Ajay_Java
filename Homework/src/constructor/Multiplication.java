package constructor;

public class Multiplication {
	Multiplication(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Multiplication m = new Multiplication(12, 6);
	}
}
