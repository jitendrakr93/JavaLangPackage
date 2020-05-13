package com.jit.pgm04;

import java.lang.reflect.Method;

/*getClass method*/
public class Test {

	public static void main(String[] args) {
		int count = 0;
		Object o = new String("durga");
		Class c = o.getClass();
		System.out.println("Fully Qualified Name of class : " + c.getName());
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total number of methods : " + count);
	}

}
