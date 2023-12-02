package practice;

public class Array6 {
public static void main(String[] args) {
/*	int [] marks= {67,87,96,76,78};
	int sum=0;
	for(int element:marks) {
		sum=sum + element;
	}
	System.out.println("The value of avg marks is="+sum/marks.length);*/

	int []arr= {54,56,76,88,98};
	int avg = 0;
	int sum=0;
	for(int element:arr) {
		sum=sum+element;
		avg=sum/arr.length;
	}
	System.out.println("The value of avg mark is="+ avg);
}
}
