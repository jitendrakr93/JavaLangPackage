package com.jit.pgm03;


public class Test {

	public static void main(String[] args) {

		Student s1 = new Student("Durga", 101);
		Student s2 = new Student("Ravi", 102);
		Student s3 = new Student("Durga", 101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Durga"));
		System.out.println(s1.equals(null));
	

	}

}
