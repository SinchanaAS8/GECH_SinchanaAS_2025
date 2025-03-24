package exceptionInjava;

public class ExceptionInjava3 {
	
	public static void validation(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("Your age is :" +age);
		}
	}

	public static void main(String[] args) {
		/*
		 * final block:
		 * ============
		 * ->This will execute even if the exception occour or not
		 * ->Where we have to write the closing code like db connection, file close
		 * 
		 */
//		try {
//			System.out.println(10/0);
//		} finally {
//			System.out.println("This is final block");
//		}
		
//		try {
//			System.out.println(10/0);
//		}catch (Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("This is final block");
//		}
		
		/*
		 * throw:
		 * =====
		 * it is used to throw the exception
		 */
		validation(19);

	}

}
