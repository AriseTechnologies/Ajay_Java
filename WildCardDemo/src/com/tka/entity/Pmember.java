package com.tka.entity;

public class Pmember extends Member{
int pmfees;

public Pmember() {
	super();
	// TODO Auto-generated constructor stub
}

public Pmember(int mid, String mnm,int pmfees) {
	super(mid, mnm);
	// TODO Auto-generated constructor stub
	this.pmfees=pmfees;
}

public int getPmfees() {
	return pmfees;
}

public void setPmfees(int pmfees) {
	this.pmfees = pmfees;
}

@Override
public String toString() {
	return "Pmember [pmfees=" + pmfees + ", Mid=" + Mid + ", Mnm=" + Mnm + "]";
}


}
