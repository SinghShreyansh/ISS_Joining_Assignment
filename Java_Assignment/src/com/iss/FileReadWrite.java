package com.iss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

//Reading from a File:

//BufferedReader: Reads the file line by line, which is efficient for large files.
//Files (NIO): Provides a more modern approach to reading all lines at once.

//Writing to a File:

//BufferedWriter: Writes text to a file with the ability to write line by line.
//Files (NIO): Offers a convenient way to write a list of lines to a file.

public class FileReadWriteExample {
    public static void main(String[] args) {
    	
    	// Using I/O Buffer
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
         
        // Using NIO File
        String filePath = "input1.txt";
        List<String> lines = Arrays.asList("Hello, World!", "This is a demo test to write.");
        
        try {
        	
        	 List<String> readLines = Files.readAllLines(Paths.get(filePath));
             for (String line : readLines) {
                 System.out.println(line);
             }
             
             
            Files.write(Paths.get(filePath), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


