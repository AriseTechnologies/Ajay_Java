package practice;

// Find the number is present in array or not

public class Array4 {
	public static void main(String[] args) {
	/*	int [] marks= {76,78,89,56,45};
		int num=78;
		boolean isInarray=false;
		for(int element:marks) {
			if (num==element) {
				isInarray=true;
				break;
			}
			}
		if(isInarray) {
			 System.out.println("The value is present in the array");

		}
		else {	
			System.out.println("The value is not present in the array");

			
		}*/
      
		int[]arr= {67,75,64,78,44};
		int num=69;
		boolean isinarray=false;
		for(int element:arr) {
			if (num==element) {
				isinarray=true;
				break;
			}
		}
		if(isinarray) {
			System.out.println("The no is present in array");
		}else {
			System.out.println("The no is not Present  in array");
		}
	}
}

