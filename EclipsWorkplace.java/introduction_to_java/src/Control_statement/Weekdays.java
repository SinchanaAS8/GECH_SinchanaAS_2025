package Control_statement;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// Take user input
		/* check for weekdays and weekend using switch
		 * 1-5 weekdays and 6-8 weekend else invalid
		 */
		
		System.out.println("Enter a number (1-7) for the day of the week: ");
		Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch (day) {
            case 1:
            	System.out.println("It's a Weekday.");
                break;
            case 2:
            	System.out.println("It's a Weekday.");
                break;
            case 3:
            	System.out.println("It's a Weekday.");
                break;
            case 4:
            	System.out.println("It's a Weekday.");
                break;
            case 5:
                System.out.println("It's a Weekday.");
                break;
            case 6:
            	System.out.println("It's a Weekend.");
                break;
            case 7:
                System.out.println("It's a Weekend.");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        //or we can
//        switch (day) {
//        case 1,2,3,4,5 -> System.out.println("It's a Weekday.");
//        case 6,7 -> System.out.println("It's a Weekend.");
//        default -> System.out.println("invalid day.");
//        }
        
        String res = switch (day) {
        case 1,2,3,4,5 ->"It's a Weekday.";
        case 6,7 -> "It's a Weekend.";
        default -> "invalid day.";
        };
        System.out.println("the result is: " +res);
        
		
		//using if else5
        if (day >= 1 && day <= 5) {
        	System.out.println("It's a Weekday.");
             }
        else if (day >= 6 && day <= 7) {
            	System.out.println("It's a Weekend");
             }
        else {
            	System.out.println("invalid day");
            }
        

	}

}
