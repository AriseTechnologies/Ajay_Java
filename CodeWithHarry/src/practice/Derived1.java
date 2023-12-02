package practice;

public class Derived1 extends Base1 {
Derived1(){
	//super(4);
	System.out.println("I am the derived class constructor ");
}
Derived1(int x,int y){
	super(x);
	System.out.println("I am the overloaded constructor with value of y="+y);
}
public static void main(String[] args) {
	//Base1 b= new Base1();
	Derived1 d= new Derived1(4,6);
}
}
