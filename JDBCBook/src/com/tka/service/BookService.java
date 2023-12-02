package com.tka.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.tka.dao.BookProcess;

public class BookService {
	static Connection con=null;
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
			
		}
		catch(ClassNotFoundException c) {
			c.printStackTrace();
		}
		catch(SQLException c) {
			c.printStackTrace();
		}
		return con;
	}
 public static void addBook() throws SQLException{
	 if(con==null) {
		 connect();
	 }
	 BookProcess.addBook();
 } 
 public static void displayBook() throws SQLException{
	 BookProcess.displayBook();
 }
 public static void updateBookCost() throws SQLException{
	 BookProcess.updateBookCost();
 }
 public static void deleteBook() throws SQLException{
	 BookProcess.deleteBook();
 }
 public static void fetchData() throws SQLException{
	 BookProcess.fetchData();
 }
}
