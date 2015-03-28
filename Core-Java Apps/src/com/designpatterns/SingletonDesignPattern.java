package com.designpatterns;

public class SingletonDesignPattern {
	private static SingletonDesignPattern singletonDesignPattern=new SingletonDesignPattern();
	
	private SingletonDesignPattern(){
		
	}
	
	public static SingletonDesignPattern getInstance(){
		return singletonDesignPattern;
	}
	
	public static void showMessage(){
		System.out.println("I am in Message method");
	}
}
