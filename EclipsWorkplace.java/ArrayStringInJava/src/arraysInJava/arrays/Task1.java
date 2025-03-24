package arraysInJava.arrays;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// write a program to take the user input values and store inside array and print
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of an array: ");
				int size = sc.nextInt();
				int[] arr = new int[size];
				
				System.out.println("Enter the value for array: ");
				for(int i=0; i<arr.length;i++){
					System.out.println("enter "+i+" the element: ");
					arr[i]=sc.nextInt();			
				}
				System.out.println("Array Elements are: ");
				for(int j=0;j<arr.length;j++) {
					System.out.println(arr[j]+" ");
				}
				sc.close();

	}
	// write a program to take the user input values  in character and store inside array and print

}
