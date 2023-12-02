package constructor;

public class Simpleinterest {
	Simpleinterest(int a, int b) {
		float c = 4.5f;
		float d = a * b * c;
		System.out.println(d);

	}

	public static void main(String[] args) {
		Simpleinterest s = new Simpleinterest(8, 6);
	}
}
