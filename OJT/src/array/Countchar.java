package array;

import java.util.HashMap;
import java.util.Scanner;

public class Countchar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s=sc.nextLine();
	HashMap<Character,Integer> hm=new HashMap();
	int i=0;
	while(i<s.length()) {
		char ch=s.charAt(i);
		if(hm.containsKey(ch))
			hm.put(ch, hm.get(ch)+1);
		else
			hm.put(ch, 1);
		i++;
	}
	System.out.println(hm);
}
}
