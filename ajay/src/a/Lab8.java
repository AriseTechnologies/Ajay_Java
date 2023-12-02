package a;

public class Lab8 {
	public static void main(String[] a5) {
		int a = Integer.parseInt(a5[0]);
		int b = Integer.parseInt(a5[1]);
		int c = Integer.parseInt(a5[2]);
		int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
		int min = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
		System.out.println("Min:" + min);
		System.out.println("Max" + max);

	}
}
