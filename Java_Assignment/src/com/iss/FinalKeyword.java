package com.iss;

//Final Keyword:
//	1. Final Variable - ensures that the value of the variable cannot be changed once it has been initialized
//	2. Final Method - prevents the method from being overridden by subclasses
//	3. Final Class - prevents the class from being subclass

public class FinalKeyword {

	// Final instance variable
    final int instanceVar = 10;
    
    // Final static variable
    public static final double PI = 3.14;
    
    // Final method example
    public final void finalMethod() {
        System.out.println("Final method in FinalKeywordExample");
    }
    
    // Final class example
    public static final class FinalClass {
        public void display() {
            System.out.println("Displaying from FinalClass");
        }
    }
    
    public static void main(String[] args) {
        // Final local variable example
        final int localVar = 20;
        
        // Using final instance variable
        FinalKeyword obj = new FinalKeyword();
        System.out.println("Final instance variable: " + obj.instanceVar);
        // obj.instanceVar = 15;  // Compilation error: cannot assign a value to final variable instanceVar

        
        // Using final static variable
        System.out.println("Final static variable: " + FinalKeyword.PI);
        
        // Using final method
        obj.finalMethod();
        
        // Using final local variable
        System.out.println("Final local variable: " + localVar);
        
        // Using final class
        FinalClass finalObj = new FinalClass();
        finalObj.display();
    }
    
}
