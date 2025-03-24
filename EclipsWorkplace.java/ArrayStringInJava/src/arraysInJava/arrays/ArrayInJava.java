package arraysInJava.arrays;


public class ArrayInJava {

	public static void main(String[] args) {
		// Arrays in java
        /* 
         *         
         */
		
		int[] arr = new int[5];
//		arr[0]=30;
//		arr[1]=10;
//		arr[2]=15;
//		arr[3]=2;
//		arr[4]=5;
		//arr[5]=100 --> array index out of bound exception
		
		for(int i=0;i<=4;i++) {
			arr[i] = 10;
		}
		for(var i: arr) {
			System.out.println(i+" "); //ln to print in new
		}
		
		
	}

}
