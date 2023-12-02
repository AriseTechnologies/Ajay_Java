package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TourDao {
static Connection con=null;
public static Connection connect() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ojt", "root", "root");
		
	}
	catch(ClassNotFoundException c) {
		c.printStackTrace();
	}
	catch(SQLException c) {
		c.printStackTrace();
	}
	return con;
}
public static void validatelogin()throws SQLException{
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from login");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id and password");
	int uid=sc.nextInt();
	String upass=sc.next();
	int flag=0;
	while(rs.next()) {
		int id=rs.getInt("uid");
		String pass=rs.getString("upassword");
		if((uid==id)&&(upass.equals(pass))) {
			System.out.println("Valid user");
			flag=1;
			break;
		}else 
			flag=0;
			System.out.println("Invalid user");
		
	}
}
}
