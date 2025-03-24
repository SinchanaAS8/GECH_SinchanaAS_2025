package introduction_to_java.first_program;

import java.util.Scanner;

public class NonPrimitive {

	public static void main(String[] args) {
		//Array
		int[] array1 = {1,2,3,4,5};
		System.out.println("Array: "+array1);
		
		//String 
		// String name = " ";
		String Name = "Priya";
		System.out.println("Name:" +Name);
		
//		System.out.println("Enter Your Name");
//		Scanner sc = new Scanner(System.in);
//		String SName = sc.nextLine();
//        System.out.println("Name is:"+SName);
//        
//        System.out.println("Enter Your fullName for next();" );
//        String nName = sc.next(); // it takes only one world it will not take the white space next words 
//        System.out.println("Name is:"+nName);
        
        /* Student Name
         * Student age
         * Student marks 
         * Student gender
         * Student branch
         * Student address
         */
        
        System.out.println("Student Details");
        System.out.println("Enter student Name");
		Scanner sc = new Scanner(System.in);
		String SName = sc.nextLine();
        
		//byte age = 0;
        System.out.println("Enter student age");
        byte age =  sc.nextByte();
        
        System.out.println("Enter student Marks");
		double marks = sc.nextDouble();
        
        System.out.println("Enter student Gender");
		char Gender = sc.next().charAt(0);;
        
        
        System.out.println("Enter student Branch");
		String Branch = sc.next();
		
		 sc.nextLine();
        
        System.out.println("Enter student Address");
		String address = sc.nextLine();

        System.out.println("Name:"+SName); 
        System.out.println("Age:"+age);
        System.out.println("Marks:"+marks);
        System.out.println("Gender:"+Gender);
		System.out.println("Branch:"+Branch);
        System.out.println("Address:"+address);

	}

}
