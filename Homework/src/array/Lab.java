package array;

public class Lab {
public static void main(String[] args) {
	// int b[]=null;
	//int d[]=new int[];
	int d2[]=null;
	System.out.println(d2);
	d2=new int [0];
	System.out.println(d2); // array is there,but empty
	// d2[0]=123; // error in java.lang ArrayIndexOutOfBounds Exception:0
	// d2=new int [-1]; // error java.lang.NegativeArraySizeException
	d2=new int[9];
	int a[]=null;
	System.out.println(a);
    // a={10,20,30}; //error (must be at initializer)
	int x[]= {10,20,30};
	System.out.println(x);
	int n=x.length;
	for(int i=0; i<n; i++) {
		System.out.println(x[i]);
	}
	System.out.println(a);
	a =new int [5];
	System.out.println(a);
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+" ");
	}
	System.out.println(" ");
	a[0]=11;
	a[2]=222;
	a[4]=444;
	// a[7]=777;
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+" ");
	}
	
	
}
}
