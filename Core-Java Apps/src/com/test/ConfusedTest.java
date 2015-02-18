package com.test;

public class ConfusedTest {
	public static void main(String[] args) {
         String s1="mohan";
         String s2="mohan";
         System.out.println(s1==s2);
         
         String s3=new String("mohan");
         String s4=new String("mohan");
         System.out.println(s3==s4);
         System.out.println(s2.equals(s3));
	}
}
