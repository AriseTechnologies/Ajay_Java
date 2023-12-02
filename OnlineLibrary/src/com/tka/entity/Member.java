package com.tka.entity;

public class Member {
int memberid;
String membernm;
public Member() {
	super();
	// TODO Auto-generated constructor stub
}
public Member(int memberid, String membernm) {
	super();
	this.memberid = memberid;
	this.membernm = membernm;
}
public int getMemberid() {
	return memberid;
}
public void setMemberid(int memberid) {
	this.memberid = memberid;
}
public String getMembernm() {
	return membernm;
}
public void setMembernm(String membernm) {
	this.membernm = membernm;
}
@Override
public String toString() {
	return "Member [memberid=" + memberid + ", membernm=" + membernm + "]";
}


}
