package com.tka.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Login;
import com.tka.exception.PasswordLengthException;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginProcess {
	static Connection con=null;
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
			
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		catch(SQLException c) {
			c.printStackTrace();
		}
		return con;
	}
	public static void newRegister()throws SQLException,PasswordLengthException{
		if(con==null) {
			connect();
		}
		PreparedStatement ptmt=con.prepareStatement("insert into login values(?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id");
		int uid=sc.nextInt();
		ptmt.setInt(1, uid); // 1 specifies the first parameter in query
		System.out.println("Enter the password");
		String upass=sc.next();
		if(upass.length()<8) {
			throw new PasswordLengthException("password should not be less than 8 character");
		}
		ptmt.setString(2, upass);
		ptmt.executeUpdate();
		System.out.println("user registerd");
		
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
			}
			else
				flag=0;
		}
		if(flag==0)
			System.out.println("Invalid user");
	}
	
	public static void upDatePassword() throws SQLException{
		PreparedStatement ptmt=con.prepareStatement("update login set password=? where uid=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int uid=sc.nextInt();
		ptmt.setInt(2, uid);
		System.out.println("Enter the password");
		String pass=sc.next();
		ptmt.setString(1, pass);
		ptmt.executeUpdate();
		System.out.println("password updated");
	}
	public static void deleteAccount()throws SQLException{
		PreparedStatement ptmt=con.prepareStatement("delete from login where uid=?");
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the id");
		int uid=sc.nextInt();
		ptmt.setInt(1, uid);
		ptmt.executeUpdate();
		System.out.println("Account deleted");
	}
	public static void fetchData()throws SQLException{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from login");
		ArrayList<Login> al=new ArrayList();
		while (rs.next()) {
			int id=rs.getInt("uid");
			String pass=rs.getString("upassword");
			al.add(new Login(id,pass));
		}
		System.out.println(al);
	}


	}
