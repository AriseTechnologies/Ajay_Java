package whileloop;

public class Ex_23 {
	public static void main(String[] args) {
		int i = 1;
		int a = 0, b = 1;
		int c;
		while (i <= 9) {
			System.out.println(a + " ");
			c = a + b;
			a = b;
			b = c;
			i++;
		}
	}

}
