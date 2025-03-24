package final_this_super;

//1. final method
class Person{ 
	public final void walking() {     // Where static of the parent can not access by the child default
		System.out.println("The Person is walking");
	}
}
class Mokshitha extends Person{
	//public void walking() {        //final method cant be override here		
}


//3. final class
final class Animal{
	public void eat() {
		System.out.println("animal is eating");
	}
}
//class Cat extends Animal{
//	// final class Animal cant't be extended
//}

public class FinalInJava {

	public static void main(String[] args) {
		/*
		 * Final --> We can't change the value
		 * =====
		 * variable, method, class
		 * 
		 * variable --> The variable value can't be change
		 * method -->  We can't override
		 * class --> we can't extends the final class
		 * 
		 */
		
		//variable
		final double PI = 3.14;
		System.out.println(PI);
		//PI = 4.14;  // variable can not be modified

	}

}
