package com.jit.pgm03;

/*Override equals() method*/
public class Student {
	String name;
	int rollNo;

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			String name1 = this.name;
			int rollNo1 = this.rollNo;
			Student s = (Student) obj;
			String name2 = s.name;
			int rollNo2 = s.rollNo;
			if (name1.equals(name2) && rollNo1 == rollNo2) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}
}
