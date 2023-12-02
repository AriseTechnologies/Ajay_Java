import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeController {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.addAnnotatedClass(Employee.class).configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction t=ss.beginTransaction();
	Employee ee=new Employee(101, "Ram");
	//ss.save(ee);
	ss.update(ee);
	System.out.println("Record inserted");
	t.commit();
	ss.close();		
}
}
