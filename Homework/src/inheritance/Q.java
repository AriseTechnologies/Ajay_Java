package inheritance;

public class Q extends P {
int j;
void display() {
	System.out.println("j");
}
public static void main(String[] args) {
	Q q=new Q();
	q.i=1;
	q.j=2;
	q.display();
}
}
