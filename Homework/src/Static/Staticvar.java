package Static;

public class Staticvar {
	static int i = 10;

	public static void main(String[] args) {
		Staticvar s = new Staticvar();
		System.out.println(i); // Not Recommended
		System.out.println(i); // Recommended
	}
}
