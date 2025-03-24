package loopingStatement;

public class LoopingStatement {

	public static void main(String[] args) {
		/* 
		 * for loop
		 * while loop
		 * do-while loop
		 * for each loop
		 */
		
		//for
		 for (int i = 1; i <= 5; i++) {
	            System.out.println("Number: " + i);
	        }
		 
		 //while
		 int i = 1;
	        while (i <= 5) { 
	            System.out.println("while Result: " + i);
	            i++;
	        }
	        
	        //do-while
	        do {
	            System.out.println("do-While: " + i);
	            i++; 
	        } while (i <= 5);
		 
	       int [] arr= {1,2,3,4,5,2,1};
	       for(int a:arr) {
	    	   System.out.println(a);
	       }
		
	}

}
