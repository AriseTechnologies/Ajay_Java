package com.tka.entity;

public class Tour {
 int tid;
 String tnm;
public Tour() {
	super();
	// TODO Auto-generated constructor stub
}
public Tour(int tid, String tnm) {
	super();
	this.tid = tid;
	this.tnm = tnm;
}
@Override
public String toString() {
	return "Tour [tid=" + tid + ", tnm=" + tnm + "]";
}

}
