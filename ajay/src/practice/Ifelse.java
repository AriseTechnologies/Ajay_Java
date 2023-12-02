package practice;

public class Ifelse {
public static void main(String[] args) {
	int a=55;
	int b=12;
	int c=10;
	if(a>b && a>c) {
		System.out.println("Max=" +a);
	}else if(b>c) {
		System.out.println("Max=" +b);
	}else {
      System.out.println("Max=" +c);
	}if (a<b && a<c) {
		System.out.println("Min=" +a);
	}else if(b<c) {
		System.out.println("Min=" +b);
	}
	else {
		System.out.println("Min="+c);
	}

}
}
