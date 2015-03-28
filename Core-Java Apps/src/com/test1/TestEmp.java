package com.test1;

class Test12{
	void test1(int i){
		System.out.println("test");
	}
	void test1(int i, int j){
		System.out.println("hi");
	}
}

public class TestEmp extends Test12{
	
	@Override
	public void test1(int i){
		
	}
	@Override
	public void test1(int i, int k){
		
	}

}
