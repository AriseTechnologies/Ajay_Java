package practice;

public class Moverride extends MethodOverride {
int b;

void meth1() {
	System.out.println("I am the method of class C");
}
void meth2() {
	System.out.println("I am the method of class C");
}
public static void main(String[] args) {
	MethodOverride m=new MethodOverride();
	m.meth2();
//	m.meth1();
	Moverride m1=new Moverride();
	m1.meth1();
	m1.meth2();
}
}
