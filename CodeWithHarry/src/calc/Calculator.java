package calc;

public class Calculator {
public void calculate(int a,int b) {
	System.out.println("Your result is"+ a+b);
}
public static void main(String[] args) {
	Calculator c=new Calculator ();
	System.out.println("I am the main metod");
	c.calculate(12, 01);
}

}
	
	