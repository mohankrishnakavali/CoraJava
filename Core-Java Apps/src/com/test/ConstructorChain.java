package com.test;

public class ConstructorChain {
	public ConstructorChain() {
	System.out.println("DFC");
	}
	public ConstructorChain(int i){
		System.out.println("INT " +i);
	}
	public ConstructorChain(int i, boolean b){
		this(10);
		
		System.out.println("TWO");
	}
	public static void main(String[] args) {
		ConstructorChain chn=new ConstructorChain(11, true);
	}
}
