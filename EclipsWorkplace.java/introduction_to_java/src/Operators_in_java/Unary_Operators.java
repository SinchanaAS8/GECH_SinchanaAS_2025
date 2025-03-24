package Operators_in_java;

public class Unary_Operators {

	public static void main(String[] args) {
		 // Interger declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
        System.out.println("Postdecrement : " + (b-- +1));

	}

}
