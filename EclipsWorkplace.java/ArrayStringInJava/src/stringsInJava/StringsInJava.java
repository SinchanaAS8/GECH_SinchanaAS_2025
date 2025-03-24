package stringsInJava;

public class StringsInJava {

	public static void main(String[] args) {
		// Strings in Java
		
		/* Strings --
		 *     It is a group of characters
		 *   ex: table
		 *   need to enclose within "",
		 *   
		 *   Hoe to declare the String:
		 *   1. Using string literal 
		 *   String var_name = "string _name";
		 *   
		 *   2. Using new keyword
		 *   String var_name = new String("string_name");
		 */
		String str1 = "String1";
		String str2 = new String("String1");
		String str3 = "String1";
		String str4 = new String("String1");
		System.out.println(str1.equals(str4)); // checks for value - true
		System.out.println(str1.equals(str3));// true
		System.out.println(str2.equals(str4));//true
		System.out.println(str1==(str2)); // checks for reference/address false
		System.out.println(str1==(str3)); // true
		System.out.println(str2==(str4)); // false
		
		// We cannot change the value of string but we can 
		

	}

}
