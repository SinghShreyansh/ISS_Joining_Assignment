package com.iss;

// Method Overloading : Method overloading allows a class to have more than one method with the same name, as long as their parameter lists are different

public class CompileTimePolymorphism {
	
	public static void main(String[] args) {
        MathUtils math = new MathUtils();
        
        System.out.println("Sum of 10 and 20: " + math.add(10, 20));
        System.out.println("Sum of 10, 20 and 30: " + math.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5: " + math.add(10.5, 20.5));
    }

}

class MathUtils {
    // Overloaded method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}
