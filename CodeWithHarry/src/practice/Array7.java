package practice;

public class Array7 {
public static void main(String[] args) {
	int[] []mat1= {{4,6,6},
			       {2,5,5}};			
	int[] []mat2= {{7,6,7},
			       {9,7,8}};
    int[] []result= {{0,0,0},
    		         {0,0,0}};
    for(int i=0; i<mat1.length; i++) {
    	for(int j=0; j<mat1[i].length; j++) {
    	//	System.out.format("setting the value of i=%d and j=%d /n",i,j);
    		result[i][j]=mat1[i][j]+mat2[i][j]; 
    		System.out.print(result[i][j] +" ");

    		}System.out.println(" ");    	
     	}
   
    for (int i=0; i<mat1.length;i++) {
    	for(int j=0; j<mat1[i].length;j++) {
    		result[i][j]=mat1[i][j]+ mat2[i][j];
    		System.out.print(result[i][j]+" ");
    	}System.out.println(" ");
    }
}
}
