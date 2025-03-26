package collection_In_Java;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {
		/*
		 * List:
		 * =====
		 * * It is a child interface of collection
		 * * It will contain some of the built in method that used inside a list implemented class only 
		 */
		
		List list = new ArrayList();
		list.add(2);
		list.add("Hello");
		list.add(10.2);
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double val = (double) list.get(2);
		System.out.println(val);

	}

}
