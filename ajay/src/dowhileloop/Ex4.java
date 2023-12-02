package dowhileloop;
// WAP to print even no from 1 to 100.

public class Ex4 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
