package practice;

public class Variable {
/*static int sum (int ...arr) {
	int result=0;
	for(int a:arr) {
		result +=a;
	}
	return result;
}
public static void main(String[] args) {
	System.out.println("The sum of 4 and 5 is:"+sum(4,5 ));
	System.out.println("The sum of 4,6 and 5 is:"+sum(4,5 ,6));
	System.out.println("The sum of 4,4 and 5 is:"+sum(4,5,4 ));
	System.out.println("The sum of 4,8 and 5 is:"+sum(4,5,8 ));

}*/
	static int sum(int...arr) {
		int result=0;
		for(int a:arr) {
			result +=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(4,5,6,7));
	}
}
