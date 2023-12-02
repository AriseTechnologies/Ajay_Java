package first;

public class Average {
void avg() {
	Variable v=new Variable();
	int n1=v.a;
	int n2=v.b;
	int c=n1+n2;
	int avg=c/2;
	System.out.println(avg);
}
public static void main(String[] args) {
	Average a=new Average();
	a.avg();
}
}
