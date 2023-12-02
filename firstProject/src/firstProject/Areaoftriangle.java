package firstProject;

public class Areaoftriangle {
	void area(int b, int h) {
		int c = b * h;
		int d = c / 2;
		System.out.println("areaoftriangle=" + d);
	}

	public static void main(String[] args) {
		Areaoftriangle t = new Areaoftriangle();
		t.area(4, 6);
	}
}
