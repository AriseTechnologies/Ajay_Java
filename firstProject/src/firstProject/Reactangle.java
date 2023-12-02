package firstProject;

public class Reactangle {
	void area(int l, int b) {
		int c = l * b;
		System.out.println("area of reactangle=" + c);

	}

	public static void main(String[] args) {
		Reactangle r = new Reactangle();
		r.area(6, 8);
	}
}
