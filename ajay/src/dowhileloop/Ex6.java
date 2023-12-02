package dowhileloop;
// WAP sum of 1 to 50 even no

public class Ex6 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 50);
		System.out.println(sum);
	}
}
