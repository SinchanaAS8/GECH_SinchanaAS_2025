package stringsInJava;

public class StringInJava1 {

	public static void main(String[] args) {
		// String Method
		
		/* 1. equal
		 * 2. geequalsignorecase
		 * 3. ==
		 * 4. concat
		 * 5. touppercase
		 * 6. tolowercase
		 * 7. trim
		 * 8. startswith
		 * 9. endswith
		 * 10. strip
		 * 11. is Blank
		 * 
		 */
		
		String str1 = new String("Hello World");
		String str2 = new String("hello World");
		System.out.println("equal: "+str1.equals(str2));
		System.out.println("equalsignorecase: "+str1.equalsIgnoreCase(str2));
		System.out.println("for ==: "+str1==(str2));
		System.out.println("concat: "+str1.concat(" ").concat(str2).concat(" World"));
		System.out.println("toUpperCase: "+str1.toUpperCase());
		System.out.println("toLowerCase: "+str1.toLowerCase());
		System.out.println("startswith: "+str1.startsWith("Hello"));
		System.out.println("endswith: "+str1.endsWith("Hello"));
		
		

	}

}
