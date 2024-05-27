package com.iss;

// Map : A Map is an object that maps keys to values. A map cannot contain duplicate keys.

// 1. HashMap
//HashMap is like HashSet, it does not maintain insertion order and does not sort the elements in any order.
//It is non-synchronized. However you can make it synchronized
//It allows null keys and values. However only one null key is allowed. Multiple null values are allowed.
 
// 2. TreeMap
//It stores its elements in a red-black tree.
//The elements of TreeMap are sorted in ascending order.

// 3. LinkedHashMap
//It maintains insertion order. 


import java.util.*;
import com.iss.Student;

public class CollectionMap {

	public static void main(String[] args) {
		// 1. HashMap
		HashMap<Integer, String> hmap = new HashMap<>();

	    //key and value pairs
	    hmap.put(101, "Shreya");
	    hmap.put(105, "Singh");
	    hmap.put(111, "Shreyansh");
	    hmap.put(120, "Shiv");

	    //print HashMap elements
	    for (Map.Entry<Integer, String> entry1 : hmap.entrySet()) {
	        System.out.println("Key: " + entry1.getKey() + ", Value: " + entry1.getValue());
	    }
	    
	    
	    // 2. TreeMap
	    TreeMap<Integer, String> tmap = new TreeMap<>();

	    //key and value pairs
	    tmap.put(101, "Shreya");
	    tmap.put(105, "Singh");
	    tmap.put(111, "Shreyansh");
	    tmap.put(120, "Shiv");

	    //print HashMap elements
	    for (Map.Entry<Integer, String> entry2 : tmap.entrySet()) {
	        System.out.println("Key: " + entry2.getKey() + ", Value: " + entry2.getValue());
	    }
	    
	    
	    // 3. LinkedHashMap
	    LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();

	    //key and value pairs
	    lmap.put(100, "Chaitanya");
	    lmap.put(120, "Paul");
	    lmap.put(105, "Derick");
	    lmap.put(111, "Logan");

	    //print LinkedHashMap elements
	    for (Map.Entry<Integer, String> entry3 : lmap.entrySet()) {
	        System.out.println("Key: " + entry3.getKey() + ", Value: " + entry3.getValue());
	    }
	    
	    
	    // 4. Custom Student Object
	    Map<Student, Student> studentMap = new HashMap<>();
	    studentMap.put(new Student(1, "Alice"), new Student(101, "Alicia"));
	    studentMap.put(new Student(2, "Bob"), new Student(102, "Bobby"));
	    studentMap.put(new Student(3, "Charlie"), new Student(103, "Charles"));

	    // Iterating over the map
	    for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
	        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	    }
	    
	}
    
}
