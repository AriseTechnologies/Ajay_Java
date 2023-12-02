package Static;

public class X {
static int i=10; // static variable
int b=20;        // non static variable
void display() { // static method
	  int a=50;
	System.out.println(b);
	System.out.println(a);
	System.out.println(i);
}
static void show() {
	System.out.println(i);
//	System.out.println(b);
// If i want access non static variable in static method, compile throw error 	
}
public static void main(String[] args) {
	X x=new X();
	x.show();
	x.display();
}
}
