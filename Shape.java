package com.mycode;

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}

}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
class Square extends Shape{
	public void draw() {
		System.out.println("Square");
	}
}

