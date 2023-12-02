package practice;

// A fun in a java can call itself. such calling of function by itself is 
// called recursion

public class Recurrtion {
 static int factorial(int n) {
	 if(n==0 || n==1) {
		 return 1;
	 }else {
		 return n * factorial(n-1); 
	 }
 }
 public static void main(String[] args) {
	int n=5;
	System.out.println("the factoril of n="+factorial(n));
}
}
