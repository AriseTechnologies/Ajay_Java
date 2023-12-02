package practice;

public class Reactangle {
private int length;
private int breadth;
Reactangle(){
	this.length=4;
	this.breadth=5;
}
Reactangle(int length, int breadth){
	this.length=length;
	this.breadth=breadth;
}
public int getlength() {
	return length;
}
public int getbreadth() {
	return breadth;
}
public static void main(String[] args) {
	Reactangle r=new Reactangle(12,34);
	//r.getlength();
	System.out.println(r.getlength());
	System.out.println(r.getbreadth());
}
}
