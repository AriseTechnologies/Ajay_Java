package super_this;

public class Employee extends Person {
	private int age = 29;

	void printstudent() {
		int age = 25; // Here are two ways we have to call global variable
						// of person class
		System.out.println(super.age); // 45
		System.out.println(this.age);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// 1

		Person p = new Person();
		System.out.println(p.age); // 45

		// 2
		Employee e = new Employee();
		e.printstudent();
	}
}
