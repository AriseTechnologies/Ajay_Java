package practice;

import java.util.Scanner;

public class Exception_class {
	public static void main(String[] args) {
		int a=7;
	//	Scanner sc=new Scanner(System.in);
	//	a=sc.nextInt();
		//if(a<9) {
			try {
				throw new Myexception();
			}catch(Exception e) {
				System.out.println(e.getMessage());	
				System.out.println(e.toString());
				e.printStackTrace();
				System.out.println("finished");
			}
		}
	//}
}
