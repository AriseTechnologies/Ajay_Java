package exception;

public class ThrowsTest {
	void m1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		try {
			m2();
		} catch (ArrayIndexOutOfBoundsException e) {
			if (1 == 2) {
				throw new ArrayIndexOutOfBoundsException();

			} else {
				throw new ArrayIndexOutOfBoundsException();

			}
		}
		return;

	}

	void m2() throws ArrayIndexOutOfBoundsException {
		System.out.println("its ok");
//	void m3() throws ArrayIndexOutOfBoundException{}
		try {
			m4();
		} catch (ArithmeticException e) {
			System.out.println("m3-ok-ok");
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	void m4() throws ArithmeticException {
		m5();
	}

	void m5() throws ArithmeticException {
		int x = 10 / 0;
	}

}
