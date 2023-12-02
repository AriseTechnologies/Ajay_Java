package inheritance;

public class I extends H{
void show() {
	System.out.println("baba");
}
public static void main(String[] args) {
	H h=new I();
	h.show();
}
}
