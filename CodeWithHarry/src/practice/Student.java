package practice;

public class Student {
	void exam(int sub1,int sub2,int sub3 ) {
		 
		
		 
		 int avg=(sub1+sub2+sub3)/3;
		 if (avg>40 && sub1>33 &&sub2>33 && sub3>33 ) {
			 System.out.println("Congratulation you are pass");
			 
		 }else {
			 System.out.println("Sorry you are fail");
		 }
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.exam(45, 36, 55);
	}

}
