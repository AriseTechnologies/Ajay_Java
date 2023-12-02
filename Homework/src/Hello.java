
public class Hello {
	void goforvote(int age) {
		if (age >= 18 && age < 150) {
			System.out.println("vote sucess");
		} else {
			System.out.println("not eligible for vote");
		}

	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.goforvote(18);
	}
}
