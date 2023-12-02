package com.tka.java8;

public class AnonymousImpl {
public static void main(String[] args) {
	Greet g=new Greet() {

		@Override
		public void msg() {
			// TODO Auto-generated method stub
			System.out.println("Welcome All");
		}
		
	};
	g.msg();
	g.duration();
	Greet.subject();
}
}
