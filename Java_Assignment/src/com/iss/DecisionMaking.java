package com.iss;

//Decision Making :
//	1. if statement: Used to execute a block of code if a condition is true.
//	2. if-else statement: Used to execute one block of code if a condition is true and another block of code if the condition is false.
//	3. if-else-if ladder: Used when you have multiple conditions to check.
//	4. switch statement: Used when you have multiple conditions to check and each condition is associated with a value.

public class DecisionMaking {
	
	public static void main(String[] args) {
		
        // Example of if statement
        int number = 10;
        if (number > 0) {
            System.out.println("1. Number is positive");
        }

        
        // Example of if-else statement
        int number2 = -5;
        if (number2 > 0) {
            System.out.println("2. Number is positive");
        } else {
            System.out.println("2. Number is negative or zero");
        }

        
        // Example of if-else-if ladder
        int number3 = 0;
        if (number3 > 0) {
            System.out.println("3. Number is positive");
        } else if (number3 < 0) {
            System.out.println("3. Number is negative");
        } else {
            System.out.println("3. Number is zero");
        }

        
        // Example of switch statement
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("4. Day is: " + dayName);
    }

}
