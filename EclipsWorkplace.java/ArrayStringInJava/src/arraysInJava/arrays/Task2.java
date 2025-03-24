package arraysInJava.arrays;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		
		System.out.println("Enter the value for array: ");
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr.length; j++) {
			System.out.println("enter " + i +  + j + " the element: ");
			arr[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Array Elements are: ");		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
		}
		sc.close();
		
		// try for character input

}
}
