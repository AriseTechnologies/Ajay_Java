package polymorphism;

public class Arithmatic {
void sum(int a) {
	System.out.println(a+a);
}
void sum(double a) {
	System.out.println(a+a);
}
void sum(double a,double b) {
	System.out.println(a+b);
}
void sum(int a,double b) {
	System.out.println(a+b);
}
int sum(int a,int b) {
	return a+b;
}
void sum(double a,int b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	Arithmatic a=new Arithmatic();
	a.sum(4.5);
	a.sum(3);
	a.sum(1.5, 3.5);
	a.sum(3.5, 4);
	a.sum(4, 4.5);
	a.sum(12, 12);
	
}
}
