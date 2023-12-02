package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
	
	PreparedStatement s=c.prepareStatement("delete from student where id=?");
	s.setInt(1, 3);
	
	s.executeUpdate();
	System.out.println("Record deleted");
	
/*	s.setInt(2, 4);
	s.setString(1, "Radha");
	s.executeUpdate();
	System.out.println("Record updated");
	
	s.setInt(2, 5);
	s.setString(1, "Kajal");
	s.executeUpdate();
	System.out.println("Record updated"); */

	
	s.setInt(1, 6);

	s.executeUpdate();
	System.out.println("Record deleted");

}
}
