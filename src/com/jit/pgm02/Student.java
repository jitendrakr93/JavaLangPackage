package com.jit.pgm02;

import java.util.ArrayList;
/*reference comparision by equals() method*/
public class Student {
	String name;
	int rollNo;
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {
		Student s1 = new Student("Durga", 101);
		Student s2 = new Student("Ravi", 102);
		Student s3 = new Student("Durga", 101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
	
}
