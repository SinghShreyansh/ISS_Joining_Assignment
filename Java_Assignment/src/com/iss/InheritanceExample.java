package com.iss;

//Inheritance: 
// Java supports single inheritance and multilevel inheritance 
// but does not support multiple inheritance directly due to the complexity and ambiguity

// 1. "super" keyword is used to refer to the immediate superclass object
// 2. "extends" keyword is Used to specify that one class is inheriting from another.
// 3  subclass can call the constructor of the superclass using the super keyword.
// 4. subclass can provide a specific implementation of a method that is already defined in its superclass. This is called method overriding.


class InheritanceExample {
	
	public static void main(String[] args) {
	     Dog myDog = new Dog();
	     myDog.eat(); // This will call the overridden method in Dog
	     myDog.breathe(); // Method inherited from Mammal
	     myDog.bark(); // Method of Dog
	 }

}


//Superclass
class Animal {
 Animal() {
     System.out.println("An animal is created.");
 }

 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Subclass
class Mammal extends Animal {
 Mammal() {
     super(); // Calling the superclass constructor
     System.out.println("A mammal is created.");
 }

 void breathe() {
     System.out.println("This mammal breathes air.");
 }
}

//Subclass of Mammal
class Dog extends Mammal {
 Dog() {
     super(); // Calling the superclass constructor
     System.out.println("A dog is created.");
 }

 @Override
 void eat() {
     super.eat(); // Calling the superclass method
     System.out.println("The dog eats bones.");
 }

 void bark() {
     System.out.println("The dog barks.");
 }
}


