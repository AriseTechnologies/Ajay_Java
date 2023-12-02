package inheritance;

public class Scenarios {
	public static void main(String[] args) {

		// scenario 1

		X x = new X();// super class object a is eligible to call only X
		System.out.println(x.a); // 10
		System.out.println(x.b); // 20
//	System.out.println(x.c);  //Error: c does not exist in X
		x.m1(); // "A-m1"
		x.m2(); // "A-m2"
//	x.m3(); // Error:m3 does not exist in class X 

		// Scenario 2

		Y y = new Y();
		System.out.println(y.a); // a of X
		System.out.println(y.b); // b of Y
		System.out.println(y.c); // c of Y
		y.m1(); // m1 of X
		y.m2(); // m2 of Y
		y.m3(); // m3 of Y
		
		
		//scenario 3
		
		X x1=new Y();  //dynamic binding (everything take from super class)
		System.out.println(x1.a); // a of X
		System.out.println(x1.b); // b of x
	//	System.out.println(x1.c); // Error c of x does not exist in X
		x1.m1(); // m1 of X
		x1.m2(); // m2 of Y
	//	x1.m3(); // Error m3 of X does not exist in X
		
		
		// Scenario 4
		
	//	Y y1=new X();   can not convert from X toY
		
		
		// Scenario 5
		
		X x2=new X();
		Y y2=new Y();
		System.out.println(x2.a);
		System.out.println(x2.b);
	//	System.out.println(x2.c);
		x2.m1();
		x2.m2();
	//	x2.m3();
	}
}
