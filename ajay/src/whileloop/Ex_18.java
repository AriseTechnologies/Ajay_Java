package whileloop;

public class Ex_18 {
	public static void main(String[] args) {
		int i=1;
		while (i<=10) {
			if (i%2!=0) {
				System.out.print(" " +i);
			}else {
				System.out.print(" "+-i);
			}
			i++;
		}
	}

}