package practice;

// Create array of 5 float and calculate their sum.

public class Array3 {
	public static void main(String[] args) {
	/*	float[] marks = { 55.5f, 67.5f, 87.5f, 88.5f, 96.5f };
		float sum = 0;

		// using for each loop

		for (float element : marks) {
			sum = sum + element;
		}
		System.out.println("The value of sum="+sum);*/

		
		float[]marks= {54.5f,72.5f,78.5f,56.5f,88.5f};
        float sum=0;
        for(float element:marks) {
        	sum=sum+element;
        }
		System.out.println("The value of sum="+sum);
	}
}
