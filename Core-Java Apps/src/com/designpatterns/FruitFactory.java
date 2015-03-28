package com.designpatterns;

public class FruitFactory {
	public Fruit getColor(String color){
		if(color==null){
			return null;
		}
		if(color.equalsIgnoreCase("apple")){
			return new Apple();
		}
		if(color.equalsIgnoreCase("banana"))
			return new Banana();
		if(color.equalsIgnoreCase("orange")){
			return new Orange();
		}
		return null;
	}
}
