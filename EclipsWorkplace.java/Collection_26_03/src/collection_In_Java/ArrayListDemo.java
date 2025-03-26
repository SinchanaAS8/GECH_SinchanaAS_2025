package collection_In_Java;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList:
		 * ==========
		 * * Array list is a improved version of array(Dynamic Array)
		 * * Array list underline data structure is Dynamic array --> we can insert and delete without giving size of an array
		 * * Array list allow duplicate
		 * * ArrayList allow random access(using index)
		 * * ArrayList will allow null value
		 * * ArrayList will preserve the order of insertion
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(null);
		list.add(55);
		list.add(null);
		list.add(55);
		list.add(5);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		list.remove(0);
		Integer i = 55;
		list.remove(i);
		System.out.println(list);

	}

}
