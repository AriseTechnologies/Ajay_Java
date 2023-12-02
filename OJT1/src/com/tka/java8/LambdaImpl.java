package com.tka.java8;

// Lambda Expression
public class LambdaImpl {
static void subject() {
	System.out.println("Java 11 features");
}
public static void main(String[] args) {
	Greet g=()->{
		System.out.println("Welcome to jbk");
		System.out.println("Java 8 features");
	};
	g.msg();
	g.duration();
	subject();
	Greet.subject();
}
}
