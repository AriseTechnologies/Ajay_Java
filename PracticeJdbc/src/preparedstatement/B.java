package preparedstatement;

import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class B {
public void insert(int id, String name) throws Exception {
Class.forName("com.mysql.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

PreparedStatement s=c.prepareStatement("insert into student values(?,?)");
s.setInt(1, id);
s.setString(2, name);
s.executeUpdate();
System.out.println("Record inserted");

}
public static void main(String[] args) throws Exception {
	B b=new B();
	b.insert(8,"Bablu");
	
}
}
