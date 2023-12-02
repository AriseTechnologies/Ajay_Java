package constructor;

public class Constoverloading {
	int value1;
	int value2;

	Constoverloading() {
		value1 = 10;
		value2 = 20;
		System.out.println("Inside the 1st constructor");
	}

	Constoverloading(int a) {
		value1 = a;
		System.out.println("Inside 2nd constructor");
	}

	Constoverloading(int a, int b) {
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd constructor");
	}

	void display() {
		System.out.println("Value1===" + value1);
		System.out.println("Value2===" + value2);
	}

	public static void main(String[] args) {
		Constoverloading d1 = new Constoverloading();
		Constoverloading d2 = new Constoverloading(30);
		Constoverloading d3 = new Constoverloading(30, 40);
		d1.display();
		d2.display();
		d3.display();
	}
}
