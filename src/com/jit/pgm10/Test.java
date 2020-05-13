package com.jit.pgm10;

/*Autoboxing vs var-arg method*/
public class Test {
	public static void m1(int... x) {
		System.out.println("var arg method");
	}

	public static void m1(Integer l) {
		System.out.println("Autoboxing");
	}

	public static void main(String[] args) {
		int x = 10;
		m1(x);
	}
}
/*Autoboxing dominates vararg*/