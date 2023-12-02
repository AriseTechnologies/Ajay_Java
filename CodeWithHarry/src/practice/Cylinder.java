package practice;

public class Cylinder {
private int height;
private int radius;
public int getheight() {
	return height;
}
public void setheight(int height) {
	this.height=height;
	
}
public int getradius() {
	return radius;
}
public void setradius(int radius) {
	this.radius=radius;
}
public double surfacearea() {
	return 2*3.14*radius*radius +2*3.14*radius*height;
}
public static void main(String[] args) {
	Cylinder c=new Cylinder();
	c.setheight(12);
	int h=c.getheight();
	System.out.println(h);
	c.setradius(8);
	System.out.println(c.getradius());
	System.out.println(c.surfacearea());
}
}
