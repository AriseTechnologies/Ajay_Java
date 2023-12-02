package dowhileloop;
// WAP sum of 1 to 50 odd no.

public class Ex5 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			if (i % 2 != 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 50);
		System.out.println(sum);
	}

}
