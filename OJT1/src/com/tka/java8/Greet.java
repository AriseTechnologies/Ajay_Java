package com.tka.java8;

@FunctionalInterface
public interface Greet {
void msg();
static void subject() {
	System.out.println("subject-java");
}
default void duration() {
	System.out.println("40 hrs");
}
}
