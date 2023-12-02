package array;

public class Tour {
private int tourid,tourcost;
private String tournm;

//Default constructor
public Tour() {
	//super();
	tourid=10;
	tournm="Mumbai-Jaipur";
	tourcost=45000;
}
//Parameterized constructor

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



}
