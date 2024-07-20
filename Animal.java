package com.mycode;

public class Animal {
	String name;
	String species;
	public Animal(String name,String species) {
		this.name=name;
		this.species=species;
	}
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}

}
class Dog extends Animal{
	String breed;
	public Dog(String name,String breed) {
		super(name,"dog");
		this.breed=breed;
		
	}
	public String getBreed() {
		return breed;
	}
}
		

