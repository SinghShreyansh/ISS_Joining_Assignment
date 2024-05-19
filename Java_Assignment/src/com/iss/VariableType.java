package com.iss;

//VariableTypes:
//	1. Local Variables.  -(scope is limited to the block or method where they are declared)
//	2. Instance Variables.  -(each instance of the class has its own copy of the variable)
//	3. Static Variables.  -(shared among all)
	
public class VariableType {
	// Static variable
    static int staticVar = 100;

    // Instance variable
    int instanceVar;

    // Constructor to initialize instance variable
    public VariableType(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    // Method to demonstrate local variable
    public void displayVariables() {
        // Local variable
        int localVar = 50;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + this.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {

    	VariableType obj1 = new VariableType(10);
        VariableType obj2 = new VariableType(20);

        // Display variables for obj1
        System.out.println("Object 1:");
        obj1.displayVariables();

        // Display variables for obj2
        System.out.println("Object 2:");
        obj2.displayVariables();

        // Modify static variable
        VariableType.staticVar = 200;

        // Display variables again to show the effect of static variable change
        System.out.println("After modifying static variable:");
        System.out.println("Object 1:");
        obj1.displayVariables();
        System.out.println("Object 2:");
        obj2.displayVariables();
    }
}
