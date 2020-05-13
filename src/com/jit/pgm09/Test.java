package com.jit.pgm09;

/*Widening vs var-arg method*/
public class Test {
	public static void m1(int... x) {
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
/*widening dominates vararg*/