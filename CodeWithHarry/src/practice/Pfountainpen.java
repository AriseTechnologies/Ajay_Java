package practice;

public class Pfountainpen extends Pen {
void write() {
	System.out.println("writing");
}
void refill() {
	System.out.println("Refill");
}
void changenib() {
	System.out.println("Changing the nib");
}
public static void main(String[] args) {
	Pfountainpen pen=new Pfountainpen();
	pen.write();
	pen.changenib();
	pen.refill();
}

}
