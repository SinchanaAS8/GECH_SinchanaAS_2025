package exceptionInjava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInjava {
	//recursion-stack overflow error
//	public static void display() {
//		display();
//	}

	public static void main(String[] args) throws FileNotFoundException {
		/* 
		 * Exception in Java:
		 * ==================
		 * * There is a unwanted or un-expected event occur in the program.
		 * * When ever there is exception the normal flow will stop
		 * 
		 * 2 types:
		 * ========
		 * 1. checked exception (compile time) -FileNotFoundException(2 ways)
		 * 2. unchecked exception(run time) - arrayIndexBoundException(1 way)
		 * 
		 *  Error:
		 *  ======
		 *  * It is a problem where the programmer can't handel it Example: stack overflow error
		 */
		// Error
		//ExceptionInjava.display();
		
		
//		Checked Exception
		//1. try catch
		PrintWriter printwriter;
//		try {
//			printwriter = new PrintWriter("abc.txt");
//			printwriter.println("Hello world");System.out.println("Hello world");
//			printwriter.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//2. throws
		printwriter = new PrintWriter("abc.txt");
		printwriter.println("Hello world");
		System.out.println("Hello world");
		printwriter.close();
		
		

	}

}
