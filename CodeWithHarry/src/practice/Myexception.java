package practice;

import java.util.Scanner;

public class Myexception extends Exception {
	@Override
public String toString() {
	return "I am toString()";
}
	@Override
public String getMessage() {
	return "I am getMessage()";
}
	
	}

