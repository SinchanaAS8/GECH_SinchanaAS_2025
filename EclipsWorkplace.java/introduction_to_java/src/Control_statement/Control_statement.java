package Control_statement;

public class Control_statement {

	public static void main(String[] args) {
		// Control Statement
		
		/* if, if else, else if and switch statement
		 * 
		 * if(condition){
		 * }
		 * 
		 * if(condition){
		 * }
		 * else{
		 * }
		 * 
		 *  if(condition){
		 * }
		 * else{
		 * }
		 * else{
		 * }
		 * else{
		 * }
		 * 
		 * switch(expression){
		 *      case value:
		 *               break;
		 *      case value:
		 *               break;
		 *      defult{}
		 *     }
		 * 
		 */
		
		 int age = 10;

	        if (age < 15) {
	        System.out.println("children");
	        }
	        
	        if (age >18) {
	        	System.out.println("yes greater then 18");
	             }
	            else{
	            	System.out.println("Yes Not greater then 18");
	             }
	        
	        //switch
	        int day = 1 ;
	        switch(day) {
            case 1 :{
            	System.out.println("sunday");
                break;
            }
            case 2 : {
            	System.out.println("Monday");
                break;
            }
            case 3 : {
            	System.out.println("Tuesdeay");
                break;
            }
            case 4 : {
            	System.out.println("wednersday");
                break;
            }
            case 5 : {
            	System.out.println("Thursday");
                break;
            }
            case 6 : {
            	System.out.println("Friday");
                break;
            }
            case 7 : {
            	System.out.println("Satarday");
                break;
            }

            default:{
            	System.out.println("number is greater 3 or less 1");
            }   
	     }
	        
	        
	        //switch case  SE11
	        switch(day) {
            case 1 ->System.out.println("sunday");
            case 2 ->System.out.println("Monday");
            case 3 ->System.out.println("Tuesdeay");
            case 4 ->System.out.println("wednesday");
            case 5 ->System.out.println("Thursday");
            case 6 ->System.out.println("Friday");
            case 7 ->System.out.println("Satarday");
            default->System.out.println("Invalid Day");  
	     }

	}
}


