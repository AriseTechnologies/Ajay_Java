package com.tka.entity;

public class Tour {
private int tourid, tourcost;
private String tournm;
public Tour() {
	//super();
	// TODO Auto-generated constructor stub
	
	tourid=10;
	tourcost=10000;
	tournm="Pune-Goa";
}
public Tour(int tourid, int tourcost, String tournm) {
	super();
	this.tourid = tourid;
	this.tourcost = tourcost;
	this.tournm = tournm;
}
public int getTourid() {
	return tourid;
}
public void setTourid(int tourid) {
	this.tourid = tourid;
}
public int getTourcost() {
	return tourcost;
}
public void setTourcost(int tourcost) {
	this.tourcost = tourcost;
}
public String getTournm() {
	return tournm;
}
public void setTournm(String tournm) {
	this.tournm = tournm;
}
@Override
public String toString() {
	return "Tour [tourid=" + tourid + ", tourcost=" + tourcost + ", tournm=" + tournm + "]";
}

public int compareTo(Tour o) {
	if(o.tourid<this.tourid)
		return 1;
	else
		return -1;
}





}
