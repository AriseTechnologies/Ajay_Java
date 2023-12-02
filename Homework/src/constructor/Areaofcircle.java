package constructor;

public class Areaofcircle {
	Areaofcircle(int r) {
		double pi = 3.14;
		double d = pi * r * r;
		System.out.println(d);
	}

	public static void main(String[] args) {
		Areaofcircle a = new Areaofcircle(5);

	}
}
