package polymorphism;

public class B extends A {
void m1() {
	System.out.println("B-m1");
}
void m3() {
	System.out.println("B-m3");
}
public static void main(String[] args) {
	B Obj=new B();
	Obj.m1();//override data taken from sub class
	Obj.m3();
	A a=new B(); //Dynamic binding(at the same time take control on two class)
	a.m1();
}
}
