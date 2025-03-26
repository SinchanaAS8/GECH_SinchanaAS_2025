package collection_In_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(3);
		System.out.println("List: "+list);
		/*
		 * Collections:
		 *    It is a utility classes that provide method to work with collection
		 */

		//sort
		Collections.sort(list);
		System.out.println("Sort: "+list);
		
		//minmum value
		System.out.println("Min value: " +Collections.min(list));
		
		//revers
		Collections.reverse(list);
		System.out.println("Revers: "+list);
	}

}
