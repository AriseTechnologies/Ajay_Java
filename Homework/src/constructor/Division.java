package constructor;

public class Division {
	Division(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Division d = new Division(32, 4);
	}
}
