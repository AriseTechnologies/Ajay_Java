package practice;

public class Cylinder1  extends Circle{
	public int height;
	Cylinder1(int r, int h){
		super(r);
		System.out.println("I am cylinder parametrized constructor");
		this.height=h;
	}
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
	public static void main(String[] args) {
		//Circle c=new Circle(12);
		Cylinder1 c1=new Cylinder1(12,23);
	}
}
