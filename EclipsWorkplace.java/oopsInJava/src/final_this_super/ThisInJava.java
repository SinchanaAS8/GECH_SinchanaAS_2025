package final_this_super;

class Person1{
	public String name;
	public int age;
	//non - args
	public Person1() {
		System.out.println("Default Constructor");
		
	}
	
	
	//all- args
	public Person1(String name, int age) {
		this();
		System.out.println("all arge Constructor");
		this.name = name;
		this.age = age;
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	public void display() {
		this.sayHello();
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+age);
	}
}

public class ThisInJava {

	public static void main(String[] args) {
		/*
		 * This Key word
		 * ============
		 *  1. Used to refer the instence variable current class
		 *  2. Used to refer the instance class
		 *  3. Used to refer the method of the instance
		 * 
		 */
		Person1 per = new Person1("Priya",19);
		per.display();

	}

}
