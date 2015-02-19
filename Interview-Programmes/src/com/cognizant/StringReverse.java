package com.cognizant;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter String to : ");
		String original=sc.next();
		String reverse="",original1="deepu";
		int length=original.length();
		for(int i=length-1;i>=0;i--){
			reverse =reverse+original.charAt(i);
		}
		//System.out.println("Reverse String is : "+ reverse);
		if(original.equals(reverse)){
			System.out.println("Enter String is Polindrome");
		}else{
			System.out.println("Enter String is Not Polindrome");
		}
	}

}
