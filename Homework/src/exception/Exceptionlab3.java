package exception;

public class Exceptionlab3 {
public static void main(String[] args) {
	try {
		ThrowsTest ex = new ThrowsTest();
		ex.m1();
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
}
}
