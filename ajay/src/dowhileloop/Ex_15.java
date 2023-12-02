package dowhileloop;
// WAP to print odd no from 1 to 25.

public class Ex_15 {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		do {
			if (i % 2 != 0) {
				count++;
			}
			i++;
		} while (i <= 25);
		System.out.println(count);
	}
}
 