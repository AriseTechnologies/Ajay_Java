package array;

import java.util.Scanner;

public class TourData {
	static Tour t1=null;
	static Tour tarr[];
	//passing object as parameter
	public static void addTour(Tour t)
	{
		t1=new Tour(t.getTourid(),t.getTourcost(),t.getTournm());
	}
	//returning object as parameter
	public static Tour getTour()
	{
		return t1;
	}
	
	//array of object as passing parameter
	public static void addNTour(Tour []t)
	{   
		tarr=new Tour [t.length];
		for(int i=0;i<t.length;i++)
		{
			tarr[i]=new Tour(t[i].getTourid(),t[i].getTourcost(),t[i].getTournm());

		}
		
	}
	//returning array of object
	public static Tour[] getNTour()
	{
		return tarr;
	}
public static boolean search() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the tour to be searched");
	String nm=sc.next();
	boolean flg=false;
	for(int i=0; i<tarr.length;i++) {
		
		
		if(tarr[i].getTournm().equals(nm)) {
			System.out.println(tarr[i]);
			flg=true;
			break;
		}
	}
	return flg;
}
	
	
}
