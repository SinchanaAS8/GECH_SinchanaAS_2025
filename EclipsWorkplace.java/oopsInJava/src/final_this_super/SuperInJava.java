package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("Parent Class Constructor");
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name:" +this.name);
		System.out.println("Age:" +this.age);
	}
	
}

class NewDog extends NewAnimal{
	public String eat;

	public NewDog(String name, int age, String eat) {
		super(name, age);
		System.out.println("Child class Constructor");
		this.eat = eat;
	}
	public void display() {
		super.display();
		System.out.println("Dog eats: " +this.eat);
		System.out.println("Name of the dog again:"+this.name);
	}
	
}
public class SuperInJava {

	public static void main(String[] args) {
		/*
		 * Super Key word
		 * ============
		 *  1. Used to refer the instence variable current class
		 *  2. Used to refer the instance class
		 *  3. Used to refer the method of the instance
		 * 
		 */

		NewDog dog = new NewDog( "dog1", 2,"abc");
		dog.display();

	}

}
