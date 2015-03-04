package com.test;

import java.util.ArrayList;

public class ComparableMain {
	public static void main(String[] args) {
		Country c1=new Country(1, "india");
		Country c2=new Country(3, "china");
		Country c3=new Country(2, "usa");
		Country c4=new Country(5, "nepal");
		Country c5=new Country(4, "bhutan");
		
		ArrayList<Country> list=new ArrayList<Country>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		System.out.println("Before Sort.....");		
		for(Country c : list){
			System.out.println("Country ID is : "+c.getCountryId() +"||" +" Country Name is : " +c.getCountryName());
		}
		System.out.println(" After Sort ....");
		
		//sort.compareTo(list);
		
		for(Country c : list){
			//if(c.compareTo(obj))
		}
		
	}
}
