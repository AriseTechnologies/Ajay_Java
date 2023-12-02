package first;

public class Check {
int a=90;
int b=20;
int c=5;
void add() {
	System.out.println(a+b);
	
}
void sub() {
	System.out.println(a-b);
}
void mult() {
	System.out.println(a*b);
}
void div() {
	System.out.println(a/b);
}
void areaofreact() {
	System.out.println(a*b);
}
void areaofcircle(int r) {
	float pi=3.14f;
	float area=pi*r*r;
	System.out.println("areaofcircle="+area);
}
void simpleinterest() {
	System.out.println(a*b*c);
}
void average() {
	System.out.println(a*b/2);
}



public static void main(String[] args) {
	Check c=new Check();
	c.add();
	c.sub();
	c.mult();
	c.div();
	c.areaofreact();
	c.simpleinterest();
	c.areaofcircle(5);
	c.average();
}
}
