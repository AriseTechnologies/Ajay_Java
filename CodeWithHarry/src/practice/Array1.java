package practice;

public class Array1 {
public static void main(String[] args) {
	float[]marks= {67.5f,78.5f,87.5f,89.5f,98.5f};
	System.out.println(marks.length);
	System.out.println(marks[3]);
	String[]students= {"Ajay","Ajinkya","Aditya","Ram"};
	System.out.println(students.length);
	System.out.println(students[2]);
	
	
/*	int[]marks= {87,86,45,76,57};
// Display array by using for loop
	for(int i=0; i<marks.length; i++) {
		System.out.println(marks[i]);
	}
	System.out.println("Printing array in reverse order");
	for(int i=marks.length-1; i>=0; i--) {
		System.out.println(marks[i]);
	}
	System.out.println("Printing array using for each loop");
	for(int element:marks) {
	System.out.println(element);
	}*/

	int [] mark= {67,87,97,46,76,88,55,56};
	System.out.println(mark.length);
	System.out.println(mark[3]);
	String  student[]= {"Payal", "Durga, Divya, Kajal, Kiran"};
	System.out.println(student[0]);
	System.out.println(student[1]);
	for(int i=0; i<mark.length;i++) {
		System.out.println( mark [i]);
	}
	System.out.println("Array in reverse order");
	for(int i=mark.length-1; i>=0;i--) {
		System.out.println(mark[i]);
	}
	System.out.println("Printing array by using for each loop");
	for(String element:student) {
		System.out.println(element);
	}
	for(int i=0; i<student.length;i++) {
		System.out.println(student[i]);
	}
	//for(int i=student.length;i>=0;i--) {
	//	System.out.println(student[i]);
	//}   Exception throws
	
	
	
	
}
}
