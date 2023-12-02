package practice;

public class Array2 {
public static void main(String[] args) {
/*	int [][] flats;
	flats=new int [2][3];
	flats[0][0]=101;
	flats[0][1]=102;
	flats[0][2]=103;
	flats[1][0]=201;
	flats[1][1]=202;
	flats[1][2]=203;
	
	// Display multidimentional array using for loop
	
	for (int i=0; i<flats.length; i++) {
		for(int j=0; j<flats[i].length; j++) {
			System.out.print(flats[i][j]);
			System.out.print(" ");
		}
		System.out.println("\n");
	}*/
	
	int[][]flat;
	flat=new int [2][3];
	flat[0][0]=101;
	flat[0][1]=102;
	flat[0][2]=103;
	flat[1][0]=201;
	flat[1][1]=202;
	flat[1][2]=203;

	for(int i=0; i<flat.length; i++) {
		for(int j=0; j<flat[i].length;j++) {
			System.out.print(flat[i][j]);
			System.out.print(" ");
		}
		System.out.println("\n");
	}
}
}
