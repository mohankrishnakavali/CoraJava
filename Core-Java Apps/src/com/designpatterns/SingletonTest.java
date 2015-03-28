package com.designpatterns;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonDesignPattern object=SingletonDesignPattern.getInstance();
		object.showMessage();
	}

}
