package polymorphism;

public class X {
void m1(Object object) {
	System.out.println("m1 with object as a param");
	
}
 void m1 (String string) {
	System.out.println("m1 with string as a param");
}
public static void main(String[] args) {
	X x=new X();
	x.m1(null);
	x.m1(new Object());
	x.m1("kiran sir");
	x.m1(new X());
	
	
	
	
	
}
}
