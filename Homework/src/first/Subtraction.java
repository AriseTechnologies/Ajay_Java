package first;

public class Subtraction {
void sub() {
	Variable v=new Variable();
	int n1=v.a;
	int n2=v.b;
	int c=n1-n2;
	System.out.println(c);
	}
public static void main(String[] args) {
	Subtraction s=new Subtraction();
	s.sub();
}
}
