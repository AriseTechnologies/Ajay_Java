package com.tka.entity;

public class InternationalTour extends Tour {
int intertcost;

public InternationalTour() {
	super();
	// TODO Auto-generated constructor stub
}

public InternationalTour(int tid, String tnm,int intertcost) {
	super(tid, tnm);
	// TODO Auto-generated constructor stub
	this.intertcost=intertcost;
}

public int getIntertcost() {
	return intertcost;
}

public void setIntertcost(int intertcost) {
	this.intertcost = intertcost;
}

@Override
public String toString() {
	return "InternationalTour [intertcost=" + intertcost + ", tid=" + tid + ", tnm=" + tnm + "]";
}

}
