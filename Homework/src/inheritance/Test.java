package inheritance;

public class Test {
	public static void main(String[] args) {
		D d = new D();
		// d.a //error:it is not accessible; it is private,'a' is not coming to
		// d
		System.out.println(d.b); // b is of c class
		System.out.println(d.c); // c is of D class and the answer will be 10,
									// not 40

	}
}
