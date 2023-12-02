package constructor;

public class Areaofreact {
	Areaofreact(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Areaofreact a = new Areaofreact(12, 5);
	}
}
