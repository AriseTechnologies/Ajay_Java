package Static;

public class Program {
	void check(int num) {
		if (num > 0) {
			System.out.println("positive");
		} else if (num == 0)
			System.out.println("zero");

		else {
			System.out.println("negative");
		}
	}

	public static void main(String[] args) {
		Program p = new Program();
		p.check(5);
	}
}
