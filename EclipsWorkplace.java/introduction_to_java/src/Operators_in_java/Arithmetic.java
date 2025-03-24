package Operators_in_java;

public class Arithmetic {

	public static void main(String[] args) {
		// Arithmetic
		
		/* Arithmetic Operators are used to perform simple arithmetic operations on primitive and non-primitive data types. 

        * : Multiplication
        / : Division
        % : Modulo
        + : Addition
        – : Subtraction 
		 */
		
		// Arithmetic operators on integers
        int a = 5;
        int b = 3;
      
           
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a + b = " + (a + b));
        
         System.out.println("Arithmetic Operation using Parsing");
        // Arithmetic operators on Strings
        String n1 = "15";
        String n2 = "25";

        // Convert Strings to integers
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);
        
        System.out.println("a1 + b1 = " + (a1 + b1));
        System.out.println("a1 - b1 = " + (a1 - b1));
        System.out.println("a1 * b1 = " + (a1 * b1));
        System.out.println("a1 / b1 = " + (a1 / b1));
        System.out.println("a1 % b1 = " + (a1 % b1));
        System.out.println("a1 + b1 = " + (a1 + b1));

	}

}
