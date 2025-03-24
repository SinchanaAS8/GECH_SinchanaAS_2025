package exceptionInjava;

public class UnChecked_Exception {

	public static void main(String[] args) {
		// Unchecked Exception
		
		int a=5;
		int b=0;
		try {
		System.out.println("Result is: " +(a/b));
		}catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Hello world");
	}

}
