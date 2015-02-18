package com.test;

public class ObjectCreationTest {
	public ObjectCreationTest(){
		System.out.println("i am in default constructor");
	}
	
	//ObjectCreationTest obj=(ObjectCreationTest)Class.forName("StringTest").newInstance();
	public static void main(String[] args) throws ClassNotFoundException {
		String str="ObjectCreationTest";
		try {
			Object cls=Class.forName(str).newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
