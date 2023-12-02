package constructor;

public class Student {
	int sid;
	String sname;
	String email;
	long phone;

	void student() { // return type void and constructor does
						// not have any return type
		// It considered as a method as it has return type
		System.out.println("method-student()");
	}

	Student() {
		System.out.println("zero parameter const");
	}

	Student(int id, String sn, String em) {
		System.out.println("3 parameter const");
		sid = id;
		sname = sn;
		email = em;
	}

	Student(int id, String sn, String em, long ph) {
		System.out.println("4 parameter const");
		sid = id;
		sname = sn;
		email = em;
		phone = ph;
	}

	String show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(email);
		System.out.println(phone);
		return "jbk";
	}

}
