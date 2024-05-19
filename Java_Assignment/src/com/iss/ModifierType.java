package com.iss;

// Access Modifier
//   1. public  - accessible everywhere
//   2. private - accessible in same class
//   3. default - accessible in same package
//   4. protected - (not accessible in different package non-subclass) / accessible in same class,same package subclass,same package non-subclass, 
//                  different package subclass

public class ModifierType {

	// Public static variable
    public static int publicStaticVar = 10;
    
    // Private instance variable
    private int privateVar = 20;
    
    // Protected instance method
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }
    
    // Default method with package-private access
    void defaultMethod() {
        System.out.println("Default method called");
    }
    
    // Public method to access private variable
    public void accessPrivateVariable() {
        privateVar = 30;   // Accessible within the same class
        System.out.println("Private variable accessed: " + privateVar);
    }
    
    public static void main(String[] args) {
    	ModifierType example = new ModifierType();
        
        // Accessing public static variable
        System.out.println("Public static variable: " + ModifierType.publicStaticVar);
        
        // Accessing instance methods
        example.protectedMethod();
        example.defaultMethod();
        
        // Accessing private variable via public method
        example.accessPrivateVariable();
    }
    
}
