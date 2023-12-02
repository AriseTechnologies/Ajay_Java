package practice;

public interface Mycamera {
void takesnap();
void recordvideo();

}
interface Mywifi{
	String [] getnetworks();
	void connectTonetwork(String network);
	
}
class Mycellphone{
	void callnumber(int phonenumber) {
		System.out.println("calling"+phonenumber);
	}
	void pickcall() {
		System.out.println("connnecting....");
	}
	
}
 
	


		
	

