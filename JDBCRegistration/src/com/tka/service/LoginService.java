package com.tka.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.tka.dao.LoginProcess;
import com.tka.entity.Login;
import com.tka.exception.PasswordLengthException;

public class LoginService {
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
		LoginProcess.newRegister();
	}
	
	public static void validatelogin()throws SQLException{
		LoginProcess.validatelogin();
		}
	
	public static void upDatePassword() throws SQLException{
		LoginProcess.upDatePassword();
	}
	public static void deleteAccount()throws SQLException{
		LoginProcess.deleteAccount();
		}
	public static void fetchData()throws SQLException{
		LoginProcess.fetchData();
		}

}
