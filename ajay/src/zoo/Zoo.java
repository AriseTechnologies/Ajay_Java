package zoo;

public class Zoo {
public static void main(String[] args) {
	Lion l=new Lion();
	Elephant e=new Elephant();
	Giraffe g=new Giraffe();
	
	Animal[]wild= {l,e,g};
	for (int i=0;i<wild.length;i++)
		wild[i].sound();
	
	eat(l);
}
public static void eat(Animal x) {
	System.out.println("The animal ate and said");
	x.sound();
}
}
