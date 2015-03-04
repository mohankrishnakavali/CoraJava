package com.test;

public class Country implements Comparable {
	private int countryId;
	private String countryName;
	public Country(int countryId, String countryName){
		super();
		this.countryId=countryId;
		this.countryName=countryName;
	}
	
	public int compareTo(Object obj){
		Country country=(Country) obj;
		return (this.countryId <country.countryId) ? -1 :(this.countryId >country.countryId)? 1 :0;  
	}
	
	public void setCountryId(int countryId){
		this.countryId=countryId;
	}
	public int getCountryId(){
		return countryId;	
	}
	
	public void setCountryName(String countryName){
		this.countryName=countryName;
	}
	public String getCountryName(){
		return countryName;
	}
}
