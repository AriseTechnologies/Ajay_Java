package a;

public class Test5 {
 	int x = 10;

	public static void main(String[] args) {
		Test4 t1 = new Test4();
		Test4 t2 = new Test4();
		t1.x = 20;
		System.out.println(t1.x + "");
		System.out.println(t2.x);
	}
}
