package ojtpractice;

public class C1 {
private C1(){
	System.out.println("constructor");
}
void m1() {
	System.out.println("method");
}
public static C1 getobj() {
	return new C1();
	
}
}
