package inheritence;

class Student1{
	//states
	public int age;
	public String name;
	public double marks;
	
	//full args constructor
	public Student1(int age, String name,double marks) {
		System.out.println("full args constructor");
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	//no-args constructor
	public Student1() {
		System.out.println("No-args constructor");
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Marks: "+this.marks);
	}
	
}
public class ConstructorInJava{
	public static void main(String[] args) {
		Student1 std1 = new Student1(12,"Mokshitha",500);
		std1.display();
		Student1 std2 = new Student1();
		std2.display();
	}
}