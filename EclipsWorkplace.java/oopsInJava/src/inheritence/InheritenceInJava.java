package inheritence;

//1. Single level
class Parent{
	int pData=5;
	public void parentMethod() {
		System.out.println("This is parent method");
	}
}
class Child2 extends Parent{
	int cData = 55;
	public void childMethod() {
		System.out.println("This is child method");
	}
}

public class InheritenceInJava {

	public static void main(String[] args) {
		/*
		 * 
		 * Inheritance :
		 *       Extending the properties of parents class to child class
		 *      
		 *   properties( State & action)
		 *     
		 *   Types:
		 *   1. Single level
		 *   2. multilevel
		 *   3. herarchical
		 *   4. hybrid
		 *    multiple inheritance is not posible
		 */
		Child2 child2 = new Child2();
		child2.childMethod();        //public & default class access using object.
		child2.parentMethod();
		System.out.println(child2.cData);
		System.out.println(child2.pData);
		// static class access using class_name

	}

}
  