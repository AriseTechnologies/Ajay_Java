package collectionframework;
import java.util.*;
public class Collection {
public static void main(String[] args) {
	ArrayList al =new ArrayList();
	Student s1= new Student();
	s1.name="ABC";
	s1.age=24;
	Student s2 =new Student ();
	s2.name="XYZ";
	s2.age=21;
	Student s3= new Student();
	s3.name="PQR";
	s3.age=19;
	al.add(s1);
	al.add(s2);
	al.add(s3);
	
	Collections.reverse(al);
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		Student st= (Student) itr.next();
		System.out.println(st.name+"--"+st.age);
}
		
}
}
