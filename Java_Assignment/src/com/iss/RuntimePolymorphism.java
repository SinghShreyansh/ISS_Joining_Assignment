package com.iss;

public class RuntimePolymorphism {

	 public static void main(String[] args) {
	        Animal myAnimal;
	        
	        myAnimal = new Dog();
	        myAnimal.sound(); // Calls the overridden method in Dog

	        myAnimal = new Cat();
	        myAnimal.sound(); // Calls the overridden method in Cat
	    }
	 
}


//Superclass
class Animal {
 void sound() {
     System.out.println("This animal makes a sound.");
 }
}

//Subclass
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("The dog barks.");
 }
}

//Subclass
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("The cat meows.");
 }
}
