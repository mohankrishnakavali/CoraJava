package com.designpatterns;

public class SingleTonSecondExample {
	private static SingleTonSecondExample stse=null;
	
	private SingleTonSecondExample(){
		
	}
	 
	public static SingleTonSecondExample getInstance(){
		if(stse ==null){
			stse=new SingleTonSecondExample();
		}
		return stse;
	}
}
