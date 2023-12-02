package practice;

public class Square {
int side =3;
void area() {
	int area=side*side;
	System.out.println(area);
}
void parameter() {
	int parameter=4*side;
	System.out.println(parameter);
}
public static void main(String[] args) {
	Square s=new Square();
	s.area();
	s.parameter();
}
}
