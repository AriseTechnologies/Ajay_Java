package first;

public class Simpleinterest {
void interest() {
	Variable v=new Variable();
	int n1=v.a;
	int n2=v.b;
	double n3=v.c;
	double d=n1*n2*n3;
	System.out.println(d);
	}
public static void main(String[] args) {
	Simpleinterest s=new Simpleinterest();
	s.interest();
}
}
