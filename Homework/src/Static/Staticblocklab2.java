package Static;

public class Staticblocklab2 {
	Staticblocklab2() {
		System.out.println("This is constructor");
	}

	{
		System.out.println("This is non static block");
	}
	static {
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		Staticblocklab2 s = new Staticblocklab2();
		Staticblocklab2 s1 = new Staticblocklab2();
	}

}
