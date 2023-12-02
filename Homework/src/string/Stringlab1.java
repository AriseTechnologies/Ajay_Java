package string;

public class Stringlab1 {
public static void main(String[] args) {
	A a=new A("kiran");
	A a1=new A("jbk");
	A a2=new A("kiran");
	String x= "javabykiran";
	String y="jbk";
	String z=new String ("javabykiran");
	
	System.out.println(x==z);
	System.out.println(y==z);
	System.out.println(x.equals(y));
	System.out.println(x==y);
	System.out.println(x.equals(z));
	System.out.println(a==a);
	System.out.println(a==a1);
	System.out.println(a1==a2);
	System.out.println(a.equals(a2));
	System.out.println(a1.equals(y));
}
}
