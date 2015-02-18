package com.test;

public class ClassTest {
	static void test(){
		System.out.println("i am in test method");
	}
	static {
		System.out.println("i am in static block");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		ClassTest ct=new ClassTest();
		Object clone=ct.clone();
	}
}
