package com.iss;

//Constructor - special type of method that is used to initialize objects. 

public class Constructor {
	
		// suppose Person class
	
	    // Instance variables
	    private String name;
	    private int age;

	    // Default constructor
	    public Constructor() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    // Parameterized constructor
	    public Constructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display details of the person
	    public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	    	Constructor person1 = new Constructor(); // Default constructor
	    	Constructor person2 = new Constructor("John Doe", 30); // Parameterized constructor

	        // Displaying details of persons
	        System.out.println("Person 1:");
	        person1.displayDetails();

	        System.out.println("\nPerson 2:");
	        person2.displayDetails();
	    }
	


}
