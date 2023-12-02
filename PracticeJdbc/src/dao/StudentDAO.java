package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDAO {
public void select() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch146", "root", "root");
	
	Statement s= c.createStatement();
	ResultSet rs= s.executeQuery("select * from student  ");
	while(rs.next()) {
		System.out.println(rs.getInt(1) +"  "+ rs.getString(2));
	}
}
}
