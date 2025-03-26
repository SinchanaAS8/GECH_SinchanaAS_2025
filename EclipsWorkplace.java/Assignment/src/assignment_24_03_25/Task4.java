package assignment_24_03_25;

//Interface Animal
interface Animal {
 void eat();       
 void makeSound(); 
}

//Dog class implementing Animal interface
class Dog implements Animal {
 @Override
 public void eat() {
     System.out.println("Dog is eating bones.");
 }

 @Override
 public void makeSound() {
     System.out.println("Dog barks: Woof! Woof!");
 }
}

//Cat class implementing Animal interface
class Cat implements Animal {
 @Override
 public void eat() {
     System.out.println("Cat is eating fish.");
 }

 @Override
 public void makeSound() {
     System.out.println("Cat meows: Meow! Meow!");
 }
}



public class Task4 {

	public static void main(String[] args) {

	     Animal myDog = new Dog();
	     Animal myCat = new Cat();

	     System.out.println("Dog Behavior:");
	     myDog.eat();
	     myDog.makeSound();

	     System.out.println("\nCat Behavior:");
	     myCat.eat();
	     myCat.makeSound();

	}

}
