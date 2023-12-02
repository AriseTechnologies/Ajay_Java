package Static;

public class Staticmethod {
static int i=10;  //static variable
int b=20;         // global variable

void display() {
	System.out.println("This is display method");
}

static void show() {  // static method
	System.out.println("Hello,This is java by kiran classes");
}

public static void main(String[] args) {
	Staticmethod s=new Staticmethod();
	s.display();
	show();
	Staticmethod s1=null;
	s1.show();
	
}
}
