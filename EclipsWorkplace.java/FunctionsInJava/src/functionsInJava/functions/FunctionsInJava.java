package functionsInJava.functions;

public class FunctionsInJava {
	//2 function return a value and accepting parameter
	public int add(int a, int b) {
		return a+b;
	}
	public void add3(int a, int b) {
		System.out.println(a+b);
	}
	
	//3.function accepting a parameter and not returning a value
	public void  add1(int c,int d) {
		System.out.println(c+d);
	}
	//4.function not accepting a parameter and not  returning a value
	public void add2() {
		System.out.println("function not accepting a parameter and not  returning a value");
	}

	public static void main(String[] args) {
		// Functions/Methods in java
		/* 
		 * <access_modifier> return_type function_name(parameters){
		 *    code
		 *    }
		 *  public void add(int a, int b){
		 *  syso(a+b);
		 *  }
		 *  two:
		 *  1. built-in-next(),nextline(),println(),equals()q
		 *  2. User defined:
		 *  
		 *  a. function return a value not accepting parameter
		 *  b. function return a value and accepting parameter
		 *  c. function not return a value but accepting parameter
		 *  d. function not return a value also  not accepting a parameter
		 * 
		 */
		
		FunctionsInJava obj1 = new FunctionsInJava();
		int res = obj1.add(5,6);
		System.out.println("Output: "+res);	
		obj1.add1(20,30);
		obj1.add2();


		
	}

}
