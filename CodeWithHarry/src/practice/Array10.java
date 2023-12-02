package practice;

// Array is sorted or not

public class Array10 {
	public static void main(String[] args) {
	/*	boolean isSorted = true;
		int[] arr = { 1, 3, 4, 5, 66, 78 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isSorted = false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("The array is sorted");
		} else {
			System.out.println("The array is not sorted");
		}*/ 
		
		boolean isSorted=true;
		int []arr= {43,55,67,78,89};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				 isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("The array is sorted");
		}else {
			System.out.println("The array is not sorted");
		}
	}
}
