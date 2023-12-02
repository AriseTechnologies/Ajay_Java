import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class DriverAndConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		// Why we load driver
		// to drive the Mysql software
		
	    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch146", "root", "root");
	    System.out.println("Connection done");
	    
	  //  String insert="insert into employee values(101,'Ajay')";
	    Statement s=c.createStatement();
	//    s.executeUpdate(insert);
	//    System.out.println("Record inserted");
	    
	    String update="update employee set name ='Ajinkya' where id=101";
	    s.executeUpdate(update);
	    System.out.println("Record updated");
	    
	    String delete="delete from employee where id=101";
	    s.executeUpdate(delete);
	    System.out.println("Record Deleted");
	    
	    String insert="insert into employee values(101,'Ajay')";
	    s.executeUpdate(insert);
	    System.out.println("Record inserted");
	    
	}
}
