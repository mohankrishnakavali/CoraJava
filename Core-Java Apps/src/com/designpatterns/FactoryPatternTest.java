package com.designpatterns;

public class FactoryPatternTest {
	public static void main(String[] args) {
		ShapeFactory sf=new ShapeFactory();
		Shape shape=sf.getShape("circle");
		shape.draw();
		Shape shape1=sf.getShape("square");
		shape1.draw();
		Shape shape2=sf.getShape("rectangle");
		shape2.draw();
		
	}
}
