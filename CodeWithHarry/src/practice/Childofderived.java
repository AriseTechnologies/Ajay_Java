package practice;

public class Childofderived extends Derived1 {
Childofderived(){
	System.out.println("I am the child of derived constructor");
}
Childofderived(int x, int y,int z){
	super(x,y);
	System.out.println("I am the overloaded constructor with value of z="+z);
}
public static void main(String[] args) {
	Childofderived c= new Childofderived(11,23,23);
}
}
