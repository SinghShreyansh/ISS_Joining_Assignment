package com.iss;

//Array : used to store multiple values of the same type in a single variable

public class Array {

	public static void main() {
		// Declaring an Array
		int[] myArray;
		
		//Initializing an Array
		int[] myArray1 = new int[5]; // An array of integers with 5 elements
		int[] myArray2 = {1, 2, 3, 4, 5}; // An array with initial values
		int[] myArray3 = new int[]{1, 2, 3, 4, 5};
		
		//Access array elements 
		int firstElement = myArray2[0]; // Accessing the first element
		int thirdElement = myArray2[2]; // Accessing the third element
		
		int[] numbers = {1, 2, 3, 4, 5};
		// Accessing and modifying array elements
        System.out.println("Original first element: " + numbers[0]);
        numbers[0] = 10;
        System.out.println("Modified first element: " + numbers[0]);
        
        // Looping through the array using a for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        
        // Looping through the array using an enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }
        
        
        // Declaring and initializing a two-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements in a two-dimensional array
        System.out.println("Element at matrix[0][0]: " + matrix[0][0]);
        System.out.println("Element at matrix[1][1]: " + matrix[1][1]);

        // Looping through a two-dimensional array
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at matrix[" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }
        

	}
}
