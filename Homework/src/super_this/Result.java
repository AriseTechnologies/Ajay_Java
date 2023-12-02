package super_this;

public class Result extends Z {
  int x=40;
void m1() {
	int x=50;
	System.out.println(x);
	System.out.println(this.x);
	System.out.println(super.x);
	X a=new X();
	System.out.println(a.x);
	Y b=new Y();
	System.out.println(b.x);
}
public static void main(String[] args) {
	Result r=new Result();
	r.m1();
}
}
