package com.tka.entity;

public class DomesticTour extends Tour {
int dtcost;



public DomesticTour() {
	super();
	// TODO Auto-generated constructor stub
}

public DomesticTour(int tid, String tnm,int dtcost) {
	super(tid, tnm);
	// TODO Auto-generated constructor stub
	this.dtcost=dtcost;
}

public int getDtcost() {
	return dtcost;
}

public void setDtcost(int dtcost) {
	this.dtcost = dtcost;
}

@Override
public String toString() {
	return "DomesticTour [dtcost=" + dtcost + ", tid=" + tid + ", tnm=" + tnm + "]";
}

}
