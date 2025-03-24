package exceptionInjava;

public class ExceptionInjava2 {

	public static void main(String[] args) {
		/* 
		 * try with multiple catches
		 * --> go from child to parent not from parent to child
		 */
         int [] arr = new int[2];
         arr[0] = 5;
         arr[1] = 10;
          
         try {
//        	 System.out.println(arr[10]);
        	 System.out.println(10/0);
         } catch (ArrayIndexOutOfBoundsException e) {
        	 System.out.println(e);
         } catch (Exception e) {
        	 System.out.println(e);
         }
         System.out.println("Hello");
	}

}
