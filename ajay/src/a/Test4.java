package a;

public class Test4 {
	static int x = 10;

	public static void main(String[] args) {
		System.out.println(x);
	}

	static {
		System.out.println(x + "");
	}
}
