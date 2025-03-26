package com.CustomStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		
		Student std1 = new Student("Priya", 1, 19);
		Student std2 = new Student("Piya", 2, 10);
		Student std3 = new Student("Riya", 3, 8);
		List<Student> students = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(new Student("Moksh", 20 ,12));
		System.out.println("Before: ");
	    System.out.println(students);
//	    students.remove(1);
//	    System.out.println(students);
	    Collections.sort(students, (s1,s2)->s2.getStd_id()-s1.getStd_id());  //lamda operation
	    System.out.println("sorting by id");
	    System.out.println(students);
	    Collections.sort(students, (s1,s2)->s1.getAge()-s2.getAge()); 
	    System.out.println("sorting by age: " );
	    System.out.println(students);
	    System.out.println();
	    Collections.sort(students, (s1,s2)->s1.getName().compareTo(s2.getName())); 
	    System.out.println(students);
	    

	}

}
