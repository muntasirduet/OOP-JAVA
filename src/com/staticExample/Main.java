package com.staticExample;

public class Main {
	public static void main(String[] args) { //main function static cause it can not use any reference
		Main main = new Main();
		main.function1();
		staticFunction1();
		
		//int other class
		
		Animal human = new Animal(1,"Human");
		Animal dog = new Animal(1,"Dog");
		Animal cat = new Animal(1,"Cat");
		
//		System.out.println(human.totalAnimal); //work well but this is not good practice
//		System.out.println(dog.totalAnimal);
//		System.out.println(cat.totalAnimal);
		
		
		Animal.Wellcome(); 
		System.out.println(Animal.totalAnimal); //work well 
		System.out.println(Animal.totalAnimal);
		System.out.println(Animal.totalAnimal);
		
		
		
		
		
		
		
		
	}
	
	void function1() {
		System.out.println("this is function1");
		System.out.println(this);
		function2();
		staticFunction1();//in non static function you can use static function
	}

	
	
	static void staticFunction1() {
		System.out.println("this is static function 1");
		
		//function2(); //can not use non static function is static function
		//if we need to use must be created an instance
		
		//System.out.println(this); can not use this is static context
		
		staticFunction2();//use static function from static
	}
	static void staticFunction2() {
		System.out.println("this is static function 2");
	}
	
	void function2() {
		System.out.println("this is function2");
		
	}

}
