package constructor;

public class Average {
	Average(int a, int b) {
		int c = a + b;
		int d = c / 2;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Average a = new Average(12, 10);
	}
}
