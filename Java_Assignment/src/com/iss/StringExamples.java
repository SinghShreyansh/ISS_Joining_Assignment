package com.iss;

//String : strings are objects that represent sequences of characters. 
//Java provides String class in the java.lang package to manipulate strings.

public class StringExamples {
 public static void main(String[] args) {
     // Creating strings
     String str1 = "Hello, World!";  // avoids creating duplicate strings, --> string exists in the pool, a reference to the existing string is returned 
     String str2 = new String("Hello, World!");

     // String concatenation
     String concatResult = str1 + " - Concatenated";
     String concatResult2 = str1.concat(" - Concatenated");

     // String length
     int length = str1.length();

     // Accessing characters
     char firstChar = str1.charAt(0);
     char lastChar = str1.charAt(str1.length() - 1);

     // Substrings
     String substring1 = str1.substring(7);
     String substring2 = str1.substring(0, 5);

     // String comparison
     boolean isEqual = str1.equals(str2);

     // String modification
     String modifiedStr = str1.replace('H', 'J');


     // Output results
     System.out.println("Original String: " + str1);
     System.out.println("Concatenated String: " + concatResult);
     System.out.println("Length of String: " + length);
     System.out.println("First Character: " + firstChar);
     System.out.println("Last Character: " + lastChar);
     System.out.println("Substring from index 7: " + substring1);
     System.out.println("Substring from index 0 to 5: " + substring2);
     System.out.println("String comparison result: " + isEqual);
     System.out.println("Modified String: " + modifiedStr);
 }
}

