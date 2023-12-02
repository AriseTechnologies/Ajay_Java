import java.io.Closeable;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentController {
	
	public void insertSaveDefault() {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
		Student s1=new Student(103,"AAA");
		ss.save(s1);
		ss.close();
		
	}
	public void insertSaveParametric(int id,String name) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();
		
		Student s2=new Student(id,name);
		ss.save(s2);
		ss.close();
	}
	public void getSinglerecordload() {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Student loadExample=ss.get(Student.class, 101);
		System.out.println("loadExample"+ loadExample);
		ss.close();
	}
	public void getSinglerecordget() {
		Configuration cfg=new Configuration ();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Student getExample=ss.get(Student.class, 101);
		System.out.println("getExample"+ getExample);
		ss.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		StudentController sc=new StudentController();
		sc.getSinglerecordget();
		sc.getSinglerecordload();
		
		
		//To get a single record in database table
		// Exception will create null 
		
		Student getExample=((Session) sc).get(Student.class, 101);
		System.out.println("getExample"+ getExample);
		
		// To get a single record in database table
		// Exception will create org.hibernate.ObjectNotFoundException
		
		
		Student loadExample=((Session) sc).load(Student.class, 102);
		System.out.println("loadExample"+ loadExample);
		((Closeable) sc).close();
		
		
		
		
		
	//	Transaction t=ss.beginTransaction();
		
	/*	// Default method 
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Ajay");
		ss.save(s1);
		
		// Parameter method
		Student s2=new Student(102, "Ram");
		ss.save(s2);
		t.commit();
		ss.close(); */
	}

}
