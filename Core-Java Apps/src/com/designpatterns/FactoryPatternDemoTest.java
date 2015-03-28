package com.designpatterns;

public class FactoryPatternDemoTest {
	public static void main(String[] args) {
		//wrong way to get the instances
		/*Fruit apple = new Apple();
		apple.color();

		Fruit orange = new Orange();
		orange.color();
		
		Fruit banana = new Banana();
		banana.color();*/
		FruitFactory ff=new FruitFactory();
		Fruit ft=ff.getColor("apple");
		ft.color();
	}
}
