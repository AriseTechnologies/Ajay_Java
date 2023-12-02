package array;

import java.util.Scanner;

public class Mainmenu {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int choice=0, ch, n = 0;
 do {
	 System.out.println("1.Add Tour");
	 System.out.println("2.Display Tour");
	 System.out.println("3.Add n tour");
		System.out.println("4.Display n tour");
		System.out.println("5.Search for tour");
	 ch=sc.nextInt();
	 switch(ch) {
	 case 1:{
	  System.out.println("Enter id,cost,nm");
	  TourData.addTour(new Tour(sc.nextInt(),sc.nextInt(),sc.next()));
	  break;
	 }
	 case 2:{
		 System.out.println(TourData.getTour());
		 break;
 }
	 case 3:{
		 System.out.println("Enter how many tour");
		 n=sc.nextInt();
		 Tour t1arr[]=new Tour[n];
		 for(int i=0; i<n;i++) {
			 System.out.println("Enter id,cost,nm");
			 t1arr[i]=new Tour(sc.nextInt(),sc.nextInt(),sc.next());
			 
		 }
		 TourData.addNTour(t1arr);
		 break;
	 }
	 case 4:{
		 Tour t[]=new Tour [n];
		 t=TourData.getNTour();
		 for(int i=0; i<n; i++) {
			 System.out.println(t[i]);
		 }
		 break;
	 }
	 case 5:{
		 boolean flg=TourData.search();
		 if(flg==false)
			 System.out.println("Record not found");
	 }
 }
	 System.out.println("Enter 1 to continue else 0");
	 choice=sc.nextInt();
     
	}while(choice==1);

}
}