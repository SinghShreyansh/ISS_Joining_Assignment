package com.iss;

// Java Exception Category :
//		1. Checked exceptions - exception that is checked (notified) by the compiler at compilation-time
//      Eg., IOException, SQLException, FileNotFoundException, ClassNotFoundException, NoSuchMethodException, etc

//		2. Unchecked exceptions (Runtime Exceptions) -  exception that occurs at the time of execution
//      Eg., NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException, etc

//		3. Errors - problems that arise beyond the control of the user or the programmer. For example, OutOfMemoryError, StackOverflowError, etc


import java.io.File;
import java.io.FileReader;


public class Exception {
	
	
	 public static void main(String args[]) {	
		 
		  // 1. Checked Exception - during compilation we will get FileNotFoundException
	      File file = new File("E://file.txt");
	      FileReader fr = new FileReader(file); 
	      
	      // 2. Unchecked Exception - on compile and execute we will get --> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	      int num[] = {1, 2, 3, 4};
	      System.out.println(num[5]);
	      	      
	      
	   }

}
