package inheritence;

interface Class1 {
    void display();

    public void bookMethod1();
}

interface Class2 {
    void display();

    public void bookMethod2();
}

class ParentT {
    public void parentMethod() {
        System.out.println("ParentT: Parent Method");
    }

}

class Child1T extends ParentT implements Class1, Class2 {
    public void childMethod() {
        System.out.println("Child1T: Child Method");
    }

    @Override
    public void bookMethod1() {
        System.out.println("Class1: Interface Method 1");
    }
    
    @Override
    public void bookMethod2() {
    	 System.out.println("Class2: Interface Method 2");
    }

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}

public class Task1 {
    public static void main(String[] args) {
        ParentT p1 = new ParentT();
        p1.parentMethod();

        System.out.println();

        Child1T c1 = new Child1T();
        c1.childMethod();
        c1.parentMethod();
        c1.bookMethod1();
        c1.bookMethod2();
    }
}
