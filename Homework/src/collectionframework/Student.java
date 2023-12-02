package collectionframework;

public class Student implements Comparable{
	String name;
	int age;
	public int compareTo(Object obj) {
		Student s= (Student )obj;
		if(age==s.age)
			return 0;
		else if (age>s.age)
			return -1;
		return 0;
		
		
	}

}
