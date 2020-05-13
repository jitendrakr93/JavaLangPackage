package com.jit.pgm08;

/*Autoboxing vs Widening*/
public class Test {
	public static void m1(Integer I) {
		System.out.println("Autoboxing");
	}

	public static void m1(long l) {
		System.out.println("Widening");
	}

	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}
/*widening dominates autoboxing*/