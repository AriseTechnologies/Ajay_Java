package dowhileloop;

public class Ex_18 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 != 0) {
				System.out.print(" "+i);
			} else {
				System.out.print(" "+-i);
			}
			i++;
		} while (i <= 10);
	}
}