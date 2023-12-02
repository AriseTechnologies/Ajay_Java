
public class Operation {
	void add(int a, int b) {
		int c = a + b;
		System.out.println("addition=" + c);
	}

	void sub(int a, int b) {
		int c = a - b;
		System.out.println("subtraction=" + c);
	}

	void mult(int a, int b) {
		int c = a * b;
		System.out.println("multiplication=" + c);
	}

	void div(int a, int b) {
		int c = a / b;
		System.out.println("division=" + c);
	}

	void rectangle(int l, int w) {
		int c = l * w;
		System.out.println("area of rectangle=" + c);
	}

	void circle(int r) {
		float pi = 3.14f;
		float area = pi * r * r;
		System.out.println("area of circle=" + area);
	}

	void interest(int p, int n) {
		float r = 4.5f;
		float interest = p * n * r;
		System.out.println("simpleinterest=" + interest);
	}

	public static void main(String[] args) {
		Operation o = new Operation();
		o.add(23, 15);
		o.sub(34, 13);
		o.mult(12, 10);
		o.div(40, 8);
		o.interest(3, 4);
		o.circle(4);

	}
}
