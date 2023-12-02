package loop;

//break and continue

public class Lab4 {
	public static void main(String[] args) {
		int n = 12;
		for (int i = 2; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "Next is continue");
				continue;
			} else if (i == 9) {
				System.out.println("i is 9");
				break;
			}
			System.out.println("Ok " +i);
		}
		System.out.println("Done");
	}
}
