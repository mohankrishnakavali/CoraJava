package com.test;

public class StringEquals {
	public static void main(String[] args) {
           String s1="muni";
           String s2="muni";
           System.out.println(s1==s2);
           /*String s3=new String("muni");
           String s4=new String("muni");
           System.out.println(s1.equals(s2));
           System.out.println("===================");
           System.out.println(s1.equals(s3));
           System.out.println(s1==s3);*/
           System.out.println(s1.hashCode());
           System.out.println(s2.hashCode());
//           System.out.println(s1==s2);
	}

}
