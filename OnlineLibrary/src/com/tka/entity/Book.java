package com.tka.entity;

public class Book {
int bookid;
int bookcost;
String booknm;
public Book() {
	super();
	// TODO Auto-generated constructor stub
	
}
public Book(int bookid, int bookcost, String booknm) {
	super();
	this.bookid = bookid;
	this.bookcost = bookcost;
	this.booknm = booknm;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public int getBookcost() {
	return bookcost;
}
public void setBookcost(int bookcost) {
	this.bookcost = bookcost;
}
public String getBooknm() {
	return booknm;
}
public void setBooknm(String booknm) {
	this.booknm = booknm;
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookcost=" + bookcost + ", booknm=" + booknm + "]";
}



}
