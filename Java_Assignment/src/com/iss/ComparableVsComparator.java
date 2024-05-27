package com.iss;

//Comparable: Implemented within the class and defines the natural ordering of objects. Use the compareTo method.
//Comparator: Implemented as separate classes or anonymous classes and defines custom orderings. Use the compare method.
//You can create multiple comparators for different sort orders.

import java.util.*;
import com.iss.Student;

public class ComparableVsComparator {
	
	public static void main(String[] args) {
		
		// 1. Sorting Primitives (Using Wrapper Class)
//		you cannot directly sort primitive types (int, char, etc.) using Collections.sort(), but you can use their corresponding wrapper classes (Integer, Character, etc.).
		
		List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(9);
        intList.add(1);
        intList.add(7);

        System.out.println("Before sorting: " + intList);
//        Before sorting: [5, 2, 9, 1, 7]
        Collections.sort(intList);
        System.out.println("After sorting: " + intList);
//        After sorting: [1, 2, 5, 7, 9]
        
        
        // 2. Sorting Custom Objects Using 'Comparator'
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Shreyansh"));
        students.add(new Student(1, "Shreya"));
        students.add(new Student(2, "Shiv"));

        System.out.println("Before sorting by ID: " + students);
//        Before sorting by ID: [Student{id=3, name='Shreyansh'}, Student{id=1, name='Shreya'}, Student{id=2, name='Shiv'}]
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        System.out.println("After sorting by ID: " + students);
//        After sorting by ID: [Student{id=1, name='Shreya'}, Student{id=2, name='Shiv'}, Student{id=3, name='Shreyansh'}]

        System.out.println("Before sorting by Name: " + students);
//        Before sorting by Name: [Student{id=1, name='Shreya'}, Student{id=2, name='Shiv'}, Student{id=3, name='Shreyansh'}]
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("After sorting by Name: " + students);
//        After sorting by Name: [Student{id=2, name='Shiv'}, Student{id=1, name='Shreya'}, Student{id=3, name='Shreyansh'}]
        
        
        // 3. Sorting Custom Objects Using 'Comparable'
        // Implemented in Student.java
        // Here you can use Collections.sort()
        
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(3, "Shreyansh"));
        students1.add(new Student(1, "Shreya"));
        students1.add(new Student(2, "Shiv"));
        
        System.out.println("Before sorting: " + students);
//        Before sorting: [Student{id=2, name='Shiv'}, Student{id=1, name='Shreya'}, Student{id=3, name='Shreyansh'}]
        Collections.sort(students1);
        System.out.println("After sorting: " + students);
//        After sorting: [Student{id=2, name='Shiv'}, Student{id=1, name='Shreya'}, Student{id=3, name='Shreyansh'}]
        
        
	}

}
