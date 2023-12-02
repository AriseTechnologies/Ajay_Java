package practice;

public abstract class Mysmartphone extends Mycellphone implements Mycamera,Mywifi{
	public void takesnap() {
		System.out.println("Taking snap");
	}
	public void recordvideo() {
		System.out.println("Taking snap");
	}
	public String[] getnetwork() {
		System.out.println("Getting list of network");
		String [] networklist= {"Ajay, Bablu, Ram, Nana"};
		return networklist;
		
	}
	public void connectTonetwork(String network) {
		System.out.println("connecting to"+network);
	 
	}
	public static void main(String[] args) {
		
	
	}
}
