package practice;

public class Array5 {
public static void main(String[] args) {
	float []marks= {45.5f,56.5f,67.5f,89,5f};
	float num=56.7f;
	boolean isInArray=false;
	for(float element:marks) {
		if(num==element) {
			isInArray=true;
			break;
		}
		}
	if(isInArray) { 
		System.out.println("The value is present in the array");

	}else {
	System.out.println("The value is not present in the array");

	}

	}
}

