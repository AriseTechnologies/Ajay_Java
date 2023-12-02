package assignment;

public class Even {
	void x(int num) {

		if (num % 2 == 0) {
			System.out.println("The num is Even");
		} else {
			System.out.println("The num is odd");
		}

	}

	public static void main(String[] args) {
		Even e = new Even();
		e.x(17);
	}
}
