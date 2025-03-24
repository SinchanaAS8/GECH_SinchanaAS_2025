package inheritence;

class Parent1{
	public void parentMethod() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1{
	public void child1Method() {
		System.out.println("Child 1 Method");
	}
}

class Child2Class extends Parent1{
	public void child2Method() {
		System.out.println("Child 2 Method");
	}
}


public class Heirarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 obj1 = new Child1();
		obj1.parentMethod();
		obj1.child1Method();
		
		Child2Class obj2 = new Child2Class();
		obj2.child2Method();
		obj2.parentMethod();
		
      
	}

}
