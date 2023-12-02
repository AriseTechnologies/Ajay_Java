package constructor;

public class Z {
	Z() {            // constructor
		int a = 12;
		int b = 12;
		int c = a + b;
		System.out.println(c);

	}

	Z(String name) {
		System.out.println("Ajay");

	}

	void add() {
		System.out.println("hello");
		
		
	}

	public static void main(String[] args) {
		Z z1=new Z();
		Z z = new Z("Ajay");
		z.add();
	}
}
