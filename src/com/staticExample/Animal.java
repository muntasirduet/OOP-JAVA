package com.staticExample;

public class Animal {
	int id;
	String name;
	static int totalAnimal = 0; //it common for all.
	
	static void Wellcome() {
		System.out.println("Wellcome to earth");
	}
	public Animal(int id, String name) {
		this.id = id;
		this.name = name;
		Animal.totalAnimal+=1;//use this but better practice Classname
		//Animal.Wellcome();
	}
	

}
