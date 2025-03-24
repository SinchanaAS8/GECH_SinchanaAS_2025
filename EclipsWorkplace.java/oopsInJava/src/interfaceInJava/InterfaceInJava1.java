package interfaceInJava;

interface A{
	public void method();
}

interface B{
	public void method();
}

class Child implements A,B{
	
	@Override
	public void method() {
		System.out.println("methodA");
	}

	
//	@Override
//	public void methodA() {
//		System.out.println("methodA");
//	}
//	@Override
//	public void methodB() {
//		System.out.println("methodB");
//		
//	}
}

public class InterfaceInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
//		child.methodA();
//		child.methodB();
        child.method();
	}

}
