import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DriverAndConnection {
public void insert() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
	
	Statement s=c.createStatement();
	s.executeUpdate("insert into student values(1,'Ajay','Nanded',88)");
	s.executeUpdate("insert into student values(2,'Ram','Pune',90)");
	s.executeUpdate("insert into student values (3,'Rani', 'Nagar',77)");
	System.out.println("Record inserted");
	
}
  public void update() throws Exception {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
	  
	  Statement s=c.createStatement();
	  s.executeUpdate("update student set name='Ravi' where id=2");
	  System.out.println("Record updated");
  }
  
  public void delete() {
	  
  }
  

}
