package com.test;

 interface Abstractdemo 
 {
	//void test();

	//abstract void test1();
}
class TestAbstract implements Abstractdemo{
	void test()
	{
		System.out.println("i am from test()");
	}
	public static void main(String[] args) {
		TestAbstract ta=new TestAbstract();
		ta.test();
	}
}
