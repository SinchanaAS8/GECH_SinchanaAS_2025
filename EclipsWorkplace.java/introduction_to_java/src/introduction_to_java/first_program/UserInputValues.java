package introduction_to_java.first_program;

import java.util.Scanner;

public class UserInputValues {

	public static void main(String[] args) {
		
		/*byte = nextbyte();
		 * short = nextShort();
		 * int = nextInt();
		 * long = nextLong();
		 * float = nextFloat();
		 * double = nextDouble();
		 * boolean = nextBoolean();5
		 * 
		 */
		
		
		int age = 0;
		System.out.println("Enter the Student Age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		System.out.println("The age is : " +age);
		
		sc.nextLine(); //buffering
		//character
		System.out.println("Enter ur gender");
		char gender = sc.nextLine().charAt(0);
        System.out.println("gender is:"+gender);
		
		
		// long
		long salary = 0;
		System.out.println("Enter the Student salary");
        salary = sc.nextLong();
		System.out.println("The salary is : " +salary);

	}

}
