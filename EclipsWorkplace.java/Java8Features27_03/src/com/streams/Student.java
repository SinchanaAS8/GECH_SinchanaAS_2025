package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Syudent{
	String name;
	int marks;
	public Syudent(String name, int marks) {
		
		this.name = name;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Syudent [name=" + name + ", marks=" + marks + "]";
	}
}

public class Student {

	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Student List greater then 60.
		List<Student> student = new ArrayList<>();
		student.add(new Student("Sinchana",55));
		student.add(new Student("Sinchana",45));
		student.add(new Student("Sfhgds",40));
		
//		List<Student> stream = student.stream().filter(s->s.getmarks()>60).collect(Collectors.toList());
//		System.out.println(stream);
		
		

	}

}
