package com.test;

public class FindingFirstCharacterUP {
	public static void main(String[] args) {
		String name="Mohan";
		
		boolean br=Character.isUpperCase(name.charAt(0));
		System.out.println(br);
	}
	
	public boolean startWithUppercase(String str){
		boolean br=Character.isUpperCase(str.charAt(0));
		return br;
	}
}
