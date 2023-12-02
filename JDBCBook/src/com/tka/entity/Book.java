package com.tka.entity;

public class Book {
protected int bid;
protected int bcost;
String bnm;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int bid, int bcost, String bnm) {
	super();
	this.bid = bid;
	this.bcost = bcost;
	this.bnm = bnm;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public int getBcost() {
	return bcost;
}
public void setBcost(int bcost) {
	this.bcost = bcost;
}
public String getBnm() {
	return bnm;
}
public void setBnm(String bnm) {
	this.bnm = bnm;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bcost=" + bcost + ", bnm=" + bnm + "]";
}

}
