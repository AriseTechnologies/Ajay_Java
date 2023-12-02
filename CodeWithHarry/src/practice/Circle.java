package practice;

 public class Circle {
public  int radius;

Circle(){
	System.out.println("I am non param of circle");
}
Circle(int r){
	System.out.println("I am parametrized circle");
	this.radius=r;
}
public double area() {
	return Math.PI*this.radius*this.radius;
}
}


