package whileloop;

public class Lab1 {
	public static void main(String[] args) {
		int n = 30;
		System.out.println("Forward order");
		int i = 1;
		while (i <= n) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Reverse order");
		i = n;
		while (i >= 1) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i--;  
		}
	}
}
