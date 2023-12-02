package practice;

public class Employee_customclass {
	public static  void main(String[] args) {
		System.out.println("this is a custom class");
		Employee harry=new Employee();
		Employee john=new Employee();
		harry.id=12;
		harry.name="code with harry";
		john.id=16;
		john.name="Ajay manikdurge";
		
		System.out.println(harry.id);
		System.out.println(harry.name);
		System.out.println(john.id);
		System.out.println(john.name);
	}

}
