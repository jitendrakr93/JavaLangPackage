package com.jit.pgm13;

public class Dog implements Cloneable{
	Cat c;
	int i;
	public Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
