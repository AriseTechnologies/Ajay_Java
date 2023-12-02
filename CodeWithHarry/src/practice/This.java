package practice;

public class This {
int a;
public int getA() {
	return a;
}
This(int v){
	this.a=v;
}
public static void main(String[] args) {
	This t=new This(23);
	System.out.println(t.getA());
}
}
