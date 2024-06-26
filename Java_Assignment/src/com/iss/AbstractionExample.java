package com.iss;

// Abstraction: hiding the implementation details and showing only the essential features of an object

//In Java, abstraction can be achieved using:
//1. Abstract Classes
		// An abstract class can have both abstract and concrete methods.
		// Abstract methods do not have a body and must be implemented by subclasses.
		// A class containing at least one abstract method must be declared abstract.
		// Abstract classes cannot be instantiated.

//2. Interfaces
		// Interfaces can only have abstract methods (until Java 7). From Java 8 onwards, they can have default, static, and private methods.
		// Methods in interfaces are implicitly public and abstract (except default and static methods).
		// Interfaces cannot have instance fields (only static and final fields).
		// A class can implement multiple interfaces, providing a way for multiple inheritance of type.


public class AbstractionExample {
	
	public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the makeSound method in Dog
        myDog.eat(); // Calls the eat method in Animal
        myDog.move(); // Calls the move method in Dog

        Cat myCat = new Cat();
        myCat.makeSound(); // Calls the makeSound method in Cat
        myCat.eat(); // Calls the eat method in Animal
        myCat.move(); // Calls the move method in Cat
    }

}


//Interface
interface AnimalBehavior {
 void makeSound();
 void move();
}

//Abstract Class
abstract class Animal {
 abstract void makeSound(); // Abstract method ( public method)
 void eat() { // Concrete method
     System.out.println("This animal eats food.");
 }
}

class Dog extends Animal implements AnimalBehavior {
 @Override
 public void makeSound() { 
     System.out.println("The dog barks.");
 }

 @Override
 public void move() { 
     System.out.println("The dog runs.");
 }
}

class Cat extends Animal implements AnimalBehavior {
 @Override
 public void makeSound() { 
     System.out.println("The cat meows.");
 }

 @Override
 public void move() { 
     System.out.println("The cat walks.");
 }
}