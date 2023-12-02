package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class X {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
		a1.add(12);
		a1.add(45);
		a1.add(24);
		a1.add(67);
		Collections.sort(a1);
		Collections.reverse(a1);
		System.out.println(a1);
	}

}
