package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DriverAndConnection {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch1118", "root", "root");
	System.out.println("Connection done");
	
	Statement s=c.createStatement();
	s.executeUpdate("insert into student values(4,'Ram')");
	
// Resultset is used to fetch a data base records 	
	
	ResultSet rs=s.executeQuery("select * from student");
	while (rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
	}
}
}
