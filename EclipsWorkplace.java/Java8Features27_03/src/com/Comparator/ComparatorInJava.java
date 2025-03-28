package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class funInterface implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2; // sorting order
	}
	
}

public class ComparatorInJava {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(53);
		list.add(25);
		list.add(55);
		Collections.sort(list, new funInterface());
		System.out.println(list);
		
		Collections.sort(list, (a,b)->b-a);
		System.out.println(list);
		Collections.sort(list, (a,b)->a-b);
		System.out.println(list);

	}

}
