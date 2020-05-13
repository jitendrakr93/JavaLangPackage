package com.jit.pgm07;

/*Autoboxing and auto unboxing*/
public class Test {

	static Integer I = 10; // Autoboxing

	public static void main(String[] args) {
		int i = I; // Autounboxing
		m1(i);
	}

	private static void m1(Integer k) {
		int m = k; // Autounboxing
		System.out.println(m);
	}
}
