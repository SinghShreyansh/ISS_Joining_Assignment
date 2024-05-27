package com.iss;

//A Set is a Collection that cannot contain duplicate elements. 
//There are three main implementations of Set interface: HashSet, TreeSet, and LinkedHashSet.

// 1. HashSet
//HashSet which stores its elements in a hash table, is the best-performing implementation. 
//HashSet allows only unique elements. 
//It doesn’t maintain the insertion order 

// 2. LinkedHashSet
// LinkedHashSet maintains insertion order.

// 3. TreeSet
//TreeSet stores elements in a red-black tree. 
//It is substantially slower than HashSet. 
//TreeSet class implements SortedSet interface, which allows TreeSet to order its elements based on their values, which means TreeSet elements are sorted in ascending order.


import java.util.*;
import com.iss.Student;

public class CollectionSet {

	public static void main(String args[]){
		
		// 1. HashSet
	    HashSet<String> hashSet=new HashSet<>();
	    hashSet.add("Paul");
	    hashSet.add("Ram");
	    hashSet.add("Aaron");
	    hashSet.add("Leo");
	    hashSet.add("Becky");

	    Iterator<String> it=hashSet.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
//    Output may be : 
//	    Aaron
//	    Leo
//	    Paul
//	    Ram
//	    Becky
	    
	    // 2. LinkedHashSet
	    LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
	    linkedHashSet.add("Paul");
	    linkedHashSet.add("Ram");
	    linkedHashSet.add("Aaron");
	    linkedHashSet.add("Leo");
	    linkedHashSet.add("Becky");

	    Iterator<String> it1=linkedHashSet.iterator();
	    while(it1.hasNext()){
	      System.out.println(it1.next());
	    }
// Output:
//	    Paul
//	    Ram
//	    Aaron
//	    Leo
//	    Becky
	    
	    
	    // 3. TreeSet
	    TreeSet<String> treeSet=new TreeSet<>();
	    treeSet.add("Paul");
	    treeSet.add("Ram");
	    treeSet.add("Aaron");
	    treeSet.add("Leo");
	    treeSet.add("Becky");

	    Iterator<String> it2=treeSet.iterator();
	    while(it2.hasNext()){
	      System.out.println(it2.next());
	    }
	    
// Output:
//	    Aaron
//	    Becky
//	    Leo
//	    Paul
//	    Ram  
	    
	    // 4. Custom Object Student
	    Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Alice"));
        studentSet.add(new Student(2, "Bob"));
        studentSet.add(new Student(3, "Charlie"));
        studentSet.add(new Student(1, "Alice")); // Duplicate entry, won't be added

        // Iterating over the set
        for (Student student : studentSet) {
            System.out.println(student);
        }
        
	  }
	
}
