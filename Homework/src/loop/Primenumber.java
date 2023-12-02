package loop;

public class Primenumber {
	public static void main(String[] args) {

		// define limit
	/*	int limit = 100;
		System.out.println("Prime no bet 1 and" + limit);

		// loop through the no one by one

		for (int i = 1; i < 100; i++) {
			boolean isPrime = true;

			// check to see if the no is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}

			}
			// print the number

			if (isPrime)
				System.out.println(i + " ");
		}*/


		int limit=100;
		System.out.println("Prime number between 1 and " + limit);
		for(int i=1;i<100;i++) {
			boolean isPrime=true;
			for(int j=2; j<i;j++) {
				if (i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i+" ");
			}
		}
		
	}
}
