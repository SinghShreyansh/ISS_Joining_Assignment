package com.iss;

//Object:
//	1. Memory is allocated as soon as an object is created
//	2. An object is an instance of the class
//  3. Object is created using "new" keyword
//  4. Object has State and Methods

//Define the Student class
public class Student {
	
 // Fields of the Student class
 private String name;
 private int age;

 // Constructor to initialize the Student object
 public Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter and Setter methods for name
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 // Getter and Setter methods for age
 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     if (age > 0 && age < 100) {
         this.age = age;
     }
 }


 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Student Age: " + age);
 }

 public static void main(String[] args) {
     // Create multiple Student objects by declaring objects (instantiating a class)
     Student student1 = new Student("Shreyansh Singh", 22);
     Student student2 = new Student("Divyansh Sharma", 21);
     Student student3 = new Student("Pravin Mathew", 21);

     // Display details of each student
     System.out.println("Details of Student 1:");
     student1.displayStudentDetails();

     System.out.println("\nDetails of Student 2:");
     student2.displayStudentDetails();

     System.out.println("\nDetails of Student 3:");
     student3.displayStudentDetails();
 }
}

