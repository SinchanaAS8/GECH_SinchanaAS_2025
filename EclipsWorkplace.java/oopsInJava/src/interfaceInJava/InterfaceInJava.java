package interfaceInJava;

interface Animal{
	public void makeSound();
}

class Dog implements Animal{
	@Override
	public void makeSound() {
		System.out.println("dog barks");
	}
}

class Cat implements Animal{
	@Override
	public void makeSound() {
		System.out.println("cat sounds meow");
	}
}
public class InterfaceInJava {

	public static void main(String[] args) {
		//Interface
		
		/* It is a blue print of the class
		 * The methods in the interface by default abstract (does not contain body)
		 * from java we can write default and static method in interface
		 * 
		 * 
		 * interface interface_name{
		 *      //code
		 *  }
		 *  
		 *  example:
		 *  interface Animal{
		 *       public void makeSound();
		 *  }
		 */
		 Dog dog = new Dog();
		 dog.makeSound();
         Cat cat = new Cat();
         cat.makeSound();
	}

}
