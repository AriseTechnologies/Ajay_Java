package com.tka.entity;

public class Login {
int uid;
String upass;
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
public Login(int uid, String upass) {
	super();
	this.uid = uid;
	this.upass = upass;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUpass() {
	return upass;
}
public void setUpass(String upass) {
	this.upass = upass;
}
@Override
public String toString() {
	return "Login [uid=" + uid + ", upass=" + upass + "]";
}

}
