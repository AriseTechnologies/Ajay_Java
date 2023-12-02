package com.tka.entity;

public class Rmember extends Member
{
int rmfees;

public Rmember() {
	super();
	// TODO Auto-generated constructor stub
}

public Rmember(int mid, String mnm,int rmfees) {
	super(mid, mnm);
	// TODO Auto-generated constructor stub
	this.rmfees=rmfees;
}

public int getRmfees() {
	return rmfees;
}

public void setRmfees(int rmfees) {
	this.rmfees = rmfees;
}

@Override
public String toString() {
	return "Rmember [rmfees=" + rmfees + ", Mid=" + Mid + ", Mnm=" + Mnm + "]";
}

}
