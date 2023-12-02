package com.tka.entity;

public class Member {
protected int Mid;
protected String Mnm;
public Member() {
	super();
	// TODO Auto-generated constructor stub
}
public Member(int mid, String mnm) {
	super();
	Mid = mid;
	Mnm = mnm;
}
public int getMid() {
	return Mid;
}
public void setMid(int mid) {
	Mid = mid;
}
public String getMnm() {
	return Mnm;
}
public void setMnm(String mnm) {
	Mnm = mnm;
}
@Override
public String toString() {
	return "Member [Mid=" + Mid + ", Mnm=" + Mnm + "]";
}

}
