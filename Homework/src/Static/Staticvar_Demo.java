package Static;

public class Staticvar_Demo {
int a=10;
static int b=10;
public static void main(String[] args) {
	Staticvar_Demo st=new Staticvar_Demo();
	System.out.println(st.a);
	System.out.println(st.b);
	Staticvar_Demo st1=new Staticvar_Demo();
	int x=st1.a++;
	int y=st1.b++;
	System.out.println(x);
	System.out.println(y);
	Staticvar_Demo st2=new Staticvar_Demo();
	int p=st2.a++;
	int q=st2.b++;
	System.out.println(p);
	System.out.println(q);
	Staticvar_Demo st3=new Staticvar_Demo();
	int c=st3.a++;
	int d=st3.b++;
	System.out.println(c);
	System.out.println(d);
}

}
