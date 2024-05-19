package com.iss;

// Java uses try, catch, finally, and throw to handle exceptions.

// try - The try block contains code that might throw an exception.
// catch - The catch block follows the try block. It catches exceptions thrown by the try block. You can have multiple catch blocks to handle different types of exceptions.
// finally - The finally block follows the try or catch blocks. It always executes, regardless of whether an exception was thrown or caught. It is used to execute important code such as closing resources.
// throw: Used to explicitly throw an exception from a method or any block of code.
		//  throw new Exception("Error message");

// throws: Used in method signatures to declare that a method can throw specified exceptions, informing the method's caller to handle or declare these exceptions.
		//public void methodName() throws Exception1, Exception2 {
		     // Method body
		//}

//throw vs throws
//Purpose:
//throw is used to explicitly throw an exception from a method or block of code.
//throws is used in a method signature to declare that the method can throw specified exceptions.

//Usage Context:
//throw is used within the body of a method or a block of code.
//throws is used in the method signature.

//Exception Handling:
//When you use throw, you create an instance of the exception and throw it.
//When you use throws, you do not throw the exception yourself but indicate that the method might throw specified exceptions, 
//and it’s the caller’s responsibility to handle or declare these exceptions.

//Declaration:
//throw is followed by an instance of the exception class.
//throws is followed by the exception class names.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// below is example to handle exceptions

public class ExceptionsHandling {
	
	public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage()); // getMessage - Returns a detailed message about the exception
        } finally {
            System.out.println("Main method's finally block.");
        }
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
            throw e; // Rethrow the exception
        } finally {
        	// Ensures that the BufferedReader is closed, even if an exception occurs.
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the reader: " + e.getMessage());
                }
            }
            System.out.println("readFile method's finally block.");
        }
    }

}
