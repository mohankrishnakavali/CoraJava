package com.designpatterns;

public class FirstWaySingleTon {
	static FirstWaySingleTon fws=null;
	
	static{
		fws=new FirstWaySingleTon();
	}
}
