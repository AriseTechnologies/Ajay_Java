package whileloop;

public class Lab6 {
	public static void main(String[] args) {
		int n = 30;
		System.out.println("while");
		int i = 1;
		while (i <= n)
			System.out.println("ok" + i);
		if (i % 5 == 0) {
			System.out.println(i);
		}
		i++;
		System.out.println("do_while");
		i = 1;
		do {
			if ((i % 5) == 0) {
				System.out.println(i);
			}
			i++;
			System.out.println("ok" + i);
		} while (i <= n);

	}
}
