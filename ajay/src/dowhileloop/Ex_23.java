package dowhileloop;

public class Ex_23 {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int i = 0;
		int c;
		do {
			System.out.print(" " + a);
			c = a + b;
			a = b;
			b = c;
			i++;
		} while (i <= 8);
	}

}
