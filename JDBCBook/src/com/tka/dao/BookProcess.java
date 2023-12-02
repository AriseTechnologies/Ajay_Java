package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.tka.entity.Book;

public class BookProcess {
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
	PreparedStatement ptmt=con.prepareStatement("insert into book values(?,?,?)");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter book id");
	int bid=sc.nextInt();
	ptmt.setInt(1, bid); // 1 specify the first parameter in query
	System.out.println("Enter the book cost");
	int bcost=sc.nextInt();
	ptmt.setInt(2, bcost);
	System.out.println("Enter the book name");
	String bnm=sc.next();
	ptmt.setString(3, bnm);
	ptmt.executeUpdate();
	System.out.println("Book added");
}
public static void displayBook() throws SQLException{
	if(con==null) {
		connect();
	}
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from book");
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter bid and bname");
	int bid=sc.nextInt();
	String bnm=sc.next();
	int flag=0;
	while (rs.next()) {
		int id=rs.getInt(bid);
		String name=rs.getString(bnm);
		if((bid==id)&&name.equals(bnm)) {
			System.out.println("Book display");
			flag=1;
			break;
		}
		else 
			flag=0;
	}
	if(flag==0)
		System.out.println("Book not found");
}
public static void updateBookCost() throws SQLException{
	if(con==null) {
		connect();
	}
	PreparedStatement ptmt=con.prepareStatement("update book set bcost=? where bid=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int bid=sc.nextInt();
	ptmt.setInt(2, bid);
	System.out.println("enter the bookcost");
	int bcost=sc.nextInt();
	ptmt.setInt(1, bcost);
	ptmt.executeUpdate();
	System.out.println("Bookcost updated");
}

public static void deleteBook() throws SQLException{
	if(con==null) {
		connect();
	}
	PreparedStatement ptmt=con.prepareStatement("delete from book where bid=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id");
	int bid=sc.nextInt();
	ptmt.setInt(1, bid);
	ptmt.executeUpdate();
	System.out.println("Book deleted");
}
public static void fetchData() throws SQLException{
	if(con==null) {
		connect();
	}
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from book");
	ArrayList<Book> al=new ArrayList();
	while(rs.next()) {
		int id=rs.getInt("bid");
		int cost=rs.getInt("bcost");
		String name=rs.getString("bnm");
		al.add(new Book(id,cost,name));
	}
	System.out.println(al);
}
	
	
	

}