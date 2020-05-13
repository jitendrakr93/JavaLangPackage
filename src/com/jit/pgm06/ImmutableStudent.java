package com.jit.pgm06;

public class ImmutableStudent {
	private final int id;
	private final String name;
	private final Age age;

	public ImmutableStudent(int id, String name, Age age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

	public static void main(String[] args) {
		Age age = new Age();
		age.setDay(1);
		age.setMonth(1);
		age.setYear(1992);
		ImmutableStudent student = new ImmutableStudent(1, "Alex", age);
		System.out.println("Alex age year before modification = " + student.getAge().getYear());
		age.setYear(1993);
		System.out.println("Alex age year after modification = " + student.getAge().getYear());
	}
}
