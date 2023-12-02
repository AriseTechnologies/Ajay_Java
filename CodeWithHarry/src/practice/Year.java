package practice;

public class Year {
	void main(int year) {
	
		
		if (year%4==0 || year %400==0 ) {
			System.out.println("year is leep" );
		}else {
			System.out.println("year is not leep year");
		}
	}
	public static void main(String[] args) {
		Year y=new Year();
		y.main(2012);

	}
}

