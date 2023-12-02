package Static;

public class Vowel {
	void check(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		} else {
			System.out.println("consonent");
		}
	}

	public static void main(String[] args) {
		Vowel v = new Vowel();
		v.check('h');
	}
}
