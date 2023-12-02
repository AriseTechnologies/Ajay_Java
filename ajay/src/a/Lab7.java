package a;

public class Lab7 {
public static void main(String[] args) {
	int a=10;
	int b=20;
//	int min=(a+b)? a:b;   // Error type mismatch : cannot convert 
	                     // form int to boolean
	int min=(a<b) ? a:b;
	System.out.println(min);
	
}
}
