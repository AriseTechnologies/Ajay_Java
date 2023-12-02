package assignment;

public class Ex9 {
	int sum=0;
void sum(int num1,int num2) {
	if(num1%2!=0 && num2%2==0) {
		sum=num1+num2;
		System.out.println("The sum of Even and Odd num="+sum);
		}else {
			System.out.println("Zero");
		}
	
}
public static void main(String[] args) {
	Ex9 e=new Ex9();
	e.sum(27, 26);
}
}
