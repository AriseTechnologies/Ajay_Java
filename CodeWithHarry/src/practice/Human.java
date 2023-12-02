package practice;

public class Human extends Monkey implements BasicAnimal  {
public void speek() {
	System.out.println("Hello Sir....");
}
 public void sleep() {
	System.out.println("Sleeping...");
}
public void eat() {
	System.out.println("Eating banana...");
}
public static void main(String[] args) {
	Human h=new Human();
	h.bite();
	h.eat();
	h.sleep();
	h.jump();
}
}
