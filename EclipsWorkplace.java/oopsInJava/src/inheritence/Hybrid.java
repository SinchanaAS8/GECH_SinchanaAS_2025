package inheritence;

interface Book{
	public void display();
	public default void bookMethod() {
		System.out.println("Interface Method");
	}
}

class ParentClass implements Book{
	
	public void parentMethod() {
		System.out.println("Parent Class");
	}

	@Override
	public void display() {
		System.out.println("display");
		
	}
}

class Child1c extends ParentClass implements Book {
	
	public void childMethod() {
		System.out.println("Child Method");
	}
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p1 = new ParentClass();
		p1.bookMethod();
		p1.parentMethod();
		p1.display();
	
        System.out.println("  ");
		Child1c c1 = new Child1c();
		c1.bookMethod();
		c1.parentMethod();
		c1.bookMethod();
		c1.display();

	}

}
