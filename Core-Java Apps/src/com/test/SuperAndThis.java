package com.test;


class Test{
	int i=0;
	Test(int j)
	{
		this.i=j;
		System.out.println("I Value is : "+ i);
	}
}
public class SuperAndThis extends Test{
	 SuperAndThis(int j) {
		super(j);
		System.out.println("j value is : "+j);
	 }

	public static void main(String[] args) {
		//new Test(10);
		new SuperAndThis(10);
	}
}
