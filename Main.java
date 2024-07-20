package com.mycode;

public class Main {
	public static void main(String[] args) {
		Shape Circle = new Circle();
		Shape Square = new Square();
		Circle.draw();
		Square.draw();
		Dog n=new Dog("Sky","Chow Chow");
		System.out.println(n.getName()+" "+"is a"+" "+n.getSpecies()+" "+"breed of"+" "+n.getBreed());
	
	}

}
