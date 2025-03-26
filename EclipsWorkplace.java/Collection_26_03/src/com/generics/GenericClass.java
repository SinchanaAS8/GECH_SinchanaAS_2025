package com.generics;

class Student<T>{  // <T> will be of ant data type we declare
	T student_id;

	public Student(T student_id) {
		super();
		this.student_id = student_id;
	}
	public T returnValue() {
		return student_id;
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
//		Student std = new Student(12);
//		int value = std.returnValue();
//		System.out.println("Student id is: " +value);
		
		Student<Integer> std1 = new Student<>(8); //we can declare the datatype here --> generic
		System.out.println(std1.returnValue());
		Student<String> std2 = new Student<>("Std5");
		System.out.println(std2.returnValue());

	}

}
