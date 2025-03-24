package polymorphism;

//1. method-overriding / Runtime Polymorphiosm / Dynamic Binding
class Person{ 
	public void walking() {     // Where static of the parent can not access by the child default
		System.out.println("The Person is walking");
	}
}
class Mokshitha extends Person{
	public void walking() {
		System.out.println("Mokshitha is walking");
	}
	
}

//2. Method-overloading/ Compiltime polymorphism/static Polymorphism/ Static binding
class Addition{
	public static void add(int a, int b) {    // Static of one can be accessed here
		System.out.println("Addition:" +(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Addition:" +(a+b+c));
	}
}

public class PolymorphismInJava {

	public static void main(String[] args) {
		// 
		/* Polymorphism 
		 * =============
		 * * poly -> many
		 * * morphism -> forms
		 * * It is a mechanism that methods will perform a different actions based on the situation
		 * 
		 * 1. Method-overloading (one cla+ss)
		 * 2. Method-overriding (two class) 
		 * 
		 */
		
		//1. Method-Overriding - Override the Parent default class , where the child class override by changing the default of the parent class
		Mokshitha obj = new Mokshitha();
		obj.walking();
		
		//2. Method-overloading
		Addition obj1 = new Addition();
		obj1.add(10,20);
		obj1.add(5, 10, 50);
	}

}
