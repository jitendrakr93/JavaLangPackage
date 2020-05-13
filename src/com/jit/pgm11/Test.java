package com.jit.pgm11;

/*Autoboxing vs var-arg method*/
public class Test {
	public static void m1(Long l) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		int x = 10;
		// m1(x);

	}
}
/*
 * Widening followed by autoboxing is not allowed in java, whereas autoboxing
 * followed by widening is allowed
 */