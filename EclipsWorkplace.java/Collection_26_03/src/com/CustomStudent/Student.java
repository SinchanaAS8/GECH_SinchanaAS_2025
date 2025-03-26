package com.CustomStudent;

public class Student {
	private String name;
	private int std_id;
	private int age;
	
	public Student(String name, int std_id, int age) {
		super();
		this.name = name;
		this.std_id = std_id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", std_id=" + std_id + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
