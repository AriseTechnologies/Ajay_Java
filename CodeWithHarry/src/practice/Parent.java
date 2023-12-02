package practice;

public abstract class Parent {
Parent(){
	System.out.println("I am the constructor of parent class");
}
public void sayhello() {
	System.out.println("Hello");
}
abstract public void greet();
abstract public void greet1();
}
