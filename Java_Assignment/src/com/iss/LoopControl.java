package com.iss;

//Loop Control : 
//	1. for loop: Used when the number of iterations is known.
//	2. while loop: Used when the number of iterations is not known in advance.
//	3. do-while loop: Similar to while loop but guarantees at least one execution.
//	4. Loop control statements: break(remove from loop), continue(move directly to next iteration), and return are used to control the flow of loop execution.

public class LoopControl {
	
	public static void main(String args[]) {
		
		// 1. For Loop with break
		// Print numbers until 5 and then break the loop
        for (int i = 1; i <= 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println("Number: " + i);
        }
        
        // 2. While Loop with continue
        int i = 0;
        // Print only even numbers from 1 to 10
        while (i <= 10) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Even number: " + i);
        }
        
        
        // 3. do-while loop
        int j = 1;
        // Print numbers from 1 to 5
        do {
            System.out.println("Number: " + j);
            j++;
        } while (j <= 5);
        
        
	}

}
