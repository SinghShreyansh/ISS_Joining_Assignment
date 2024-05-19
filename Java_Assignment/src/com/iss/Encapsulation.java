package com.iss;

// Encapsulation : Restricts direct access to some of an object's components, which can protect the internal state of the object and ensure that it is only modified in controlled ways. 
//                 This is achieved by using access modifiers to control access to class members (fields and methods) and by providing public methods (getters and setters) to access and update private fields.

public class Person {
	
	// Private fields
    private String name;
    private int age;

    // Constructor to initialize the fields
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use the setter to validate the age
    }

    // Public getter for the name field
    public String getName() {
        return name;
    }

    // Public setter for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for the age field
    public int getAge() {
        return age;
    }

    // Public setter for the age field with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 25);

        // Display initial details
        person.displayDetails();

        // Modify the person's details using setters
        person.setName("Bob");
        person.setAge(30);

        // Display updated details
        person.displayDetails();

        // Attempt to set an invalid age
        person.setAge(-5); 
    }

}
