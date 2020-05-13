package com.jit.pgm01;

import java.util.ArrayList;
/*Override toString() method*/
public class Test {

	@Override
	public String toString() {
		return "test";
	}

	public static void main(String[] args) {
		String s = new String("Durga");
		System.out.println(s);
		Integer i = new Integer(10);
		System.out.println(i);
		ArrayList l = new ArrayList<>();
		l.add("A");
		l.add("B");
		System.out.println(l);
		Test t = new Test();
		System.out.println(t);

	}

}
