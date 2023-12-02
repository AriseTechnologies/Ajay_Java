package practice;

public class C {
	void x(int button) {
		if (button == 1) {
			System.out.println("Hello");
		} else if (button == 2) {
			System.out.println("Namaste");
		} else if (button == 3) {
			System.out.println("Bonjour");
		} else {
			System.out.println("Invalid Button");
		}
	}

	public static void main(String[] args) {
		C c = new C();
		c.x(3);
	}
}
