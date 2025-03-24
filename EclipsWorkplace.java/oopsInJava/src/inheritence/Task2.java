package inheritence;

interface ClassI1 {
    void display();

    public void bookMethod1();
}

interface ClassI2 {
    void display();

    public void bookMethod2();
}

interface ClassI3 extends ClassI1, ClassI2 {
    void display();

    public void bookMethod3();
}

class ParentT2 implements ClassI1, ClassI2 {
    public void parentMethod() {
        System.out.println("P. ParentT: Parent Method");
    }

	@Override
	public void bookMethod2() {
		System.out.println("p. Interface method2");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMethod1() {
		System.out.println("p. Interface method1");
		
	}

}

class Child2T extends ParentT2 implements ClassI1, ClassI2, ClassI3 {
    public void childMethod() {
        System.out.println("1C. Child2T: Child Method");
    }

    @Override
    public void bookMethod1() {
        System.out.println("1C. ClassI1: Interface Method 1");
    }
    
    @Override
    public void bookMethod2() {
    	 System.out.println("1C. ClassI2: Interface Method 2");
    }

	@Override
	public void display() {
		System.out.println("1C. ParentT2: Parent Display Method");
		
	}

	@Override
	public void bookMethod3() {
		System.out.println("1C. ClassI3: Interface Method 3");
		
	}

}

class Child2T2 extends ParentT2 implements ClassI1, ClassI2, ClassI3 {
    public void childMethod() {
        System.out.println("2C. Child2T2: Child Method");
    }

    @Override
    public void bookMethod1() {
        System.out.println("2C. ClassI1: Interface Method 1");
    }
    
    @Override
    public void bookMethod2() {
    	 System.out.println("2C. ClassI2: Interface Method 2");
    }

	@Override
	public void display() {
		System.out.println("2C. ParentT2: Parent Display Method");
		
	}

	@Override
	public void bookMethod3() {
		System.out.println("2C. ClassI3: Interface Method 3");
		
	}

}

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Parent Class");
		ParentT2 p1 = new ParentT2();
        p1.parentMethod();
        p1.bookMethod1();
        p1.bookMethod2();

        System.out.println();
        System.out.println("Class1 inheriting the property");

        Child2T c1 = new Child2T();
        c1.childMethod();
        c1.parentMethod();
        c1.bookMethod1();
        c1.bookMethod2();
        
        System.out.println();
        System.out.println("Class2 inheriting the property");

        Child2T2 c2 = new Child2T2();
        c2.childMethod();
        c2.parentMethod();
        c2.bookMethod1();
        c2.bookMethod2();


	}

}
