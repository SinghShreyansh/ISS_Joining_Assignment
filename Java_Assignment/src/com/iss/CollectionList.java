package com.iss;

// A List is an ordered Collection (sometimes called a sequence). Lists may contain duplicate elements. Elements can be inserted or accessed by their position in the list, using a zero-based index. The classes that implements List interface are:

// 1. ArrayList
//		It is based on an Array data structure. ArrayList is a resizable-array implementation of the List interface.
// 2. LinkedList
//		LinkedList is a linear data structure. However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers. Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.
// 3. Vector
//		Vector implements a dynamic array which means it can grow or shrink as required.
// 4. Stack
//		Stack class extends Vector class, which means it is a subclass of Vector. Stack works on the concept of Last In First Out (LIFO).


import java.util.*;
import com.iss.Student;

public class CollectionList {

	public static void main(String args[]){
		// 1. ArrayList
	    //creating ArrayList of string type
	    ArrayList<String> arrList=new ArrayList<>();

	    //adding few elements
	    arrList.add("Cricket"); //list: ["Cricket"]
	    arrList.add("Hockey"); //list: ["Cricket", "Hockey"]

	    //inserting element at first position, index 0
	    //represents first element because ArrayList is based
	    //on zero based indexing system
	    arrList.add(0, "BasketBall"); //list: ["BasketBall", "Cricket", "Hockey"]


	    System.out.println("ArrayList Elements: ");
	    //Traversing ArrayList using enhanced for loop
	    for(String str:arrList)
	      System.out.println(str);
	    
	    
	    // 2. LinkedList
	    LinkedList<String> linkList=new LinkedList<>();
	    linkList.add("Cricket"); //["Cricket"]
	    linkList.add("Hockey"); //["Cricket", "Hockey"]

	    //inserting element at first position
	    linkList.add(0, "BasketBall"); ////["BasketBall", "Cricket", "Hockey"]

	    System.out.println("LinkedList elements: ");
	    //iterating LinkedList using iterator
	    Iterator<String> it=linkList.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	    
	    
	    // 3. Vector
	    Vector<String> v=new Vector<>();
	    v.add("Cricket"); //["Cricket"]
	    v.add("Hockey"); //["Cricket", "Hockey"]
	    v.add("BasketBall"); //["Cricket", "Hockey", "BasketBall"]

	    //removing an element
	    v.remove("Hockey"); //["Cricket", "BasketBall"]

	    System.out.println("Vector Elements: ");
	    //iterating Vector using iterator
	    Iterator<String> it1=v.iterator();
	    while(it1.hasNext()){
	      System.out.println(it1.next());
	    }
	    
	    
	    // 4. Stack
	    Stack<String> stack = new Stack<>();

	    //push() method adds the element in the stack
	    //and pop() method removes the element from the stack
	    stack.push("Cricket"); //["Cricket"]
	    stack.push("Hockey"); //["Cricket", Hockey]
	    stack.push("BasketBall"); //["Cricket", "Hockey", "BasketBall"]
	    stack.pop(); //removes the last element
	    stack.push("Soccer"); //["Cricket", "Hockey", "Soccer"]
	    stack.push("Swimming"); //["Cricket", "Hockey", "Soccer", "Swimming"]
	    stack.pop(); //removes the last element

	    System.out.println("Stack elements: ");
	    for(String str: stack){
	      System.out.println(str);
	    }
	    
	    
	    // 5. With Custom Object
	    List<Student> students = new ArrayList<>();

        // Adding elements
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));

        // Iterating over the list
        for (Student student : students) {
            System.out.println(student);
        }

        // Accessing elements by index
        Student firstStudent = students.get(0);
        System.out.println("First student: " + firstStudent);

        // Updating elements
        students.set(1, new Student(2, "Robert"));
        System.out.println("Updated student list: " + students);

        // Removing elements
        students.remove(2);
        System.out.println("List after removal: " + students);
	    
	  }
	
}
