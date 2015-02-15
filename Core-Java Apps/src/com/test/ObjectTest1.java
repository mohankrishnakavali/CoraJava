package com.test;

public class ObjectTest1 {
	public ObjectTest1(Object obj) {
		System.out.println("Boom");
	}
	public static void main(String[] args) {
		new ObjectTest1(null);
	}

}
