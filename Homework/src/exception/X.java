package exception;

public class X {
public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);

	}catch(ArithmeticException e) {
		System.out.println("/ zero not allowed");
	}
	System.out.println(5);
}
}
