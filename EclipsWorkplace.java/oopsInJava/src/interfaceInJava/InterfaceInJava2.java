package interfaceInJava;

interface Interface1{
	public void method();
	public default void defaultmethod() {
		System.out.println("Default method");
	}
	public static void staticmethod() {
		System.out.println("static method");
	}
	
}
class Child1 implements Interface1{

	@Override
	public void method() {
		System.out.println("this is method");
		
	}
	
}

public class InterfaceInJava2 {

	public static void main(String[] args) {
		// 
		/*  default and static method inside interface
		 * 
		 */
		
		Child1 child = new Child1();
		child.method();
		child.defaultmethod();
		Interface1.staticmethod();
	}

}
