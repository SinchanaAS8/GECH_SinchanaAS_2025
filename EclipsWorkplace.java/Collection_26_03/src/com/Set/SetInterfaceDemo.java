package com.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		/*
		 * Set:
		 * ====
		 *    -> When you represent a group of individual object as a single entity where the
		 *  insertion order is not preserved, duplicate will not allow then we should go for Set Interface
		 *  
		 *  1. Order is not preserved
		 *  2. duplicate will not allow
		 *  3. random access is not there
		 * 
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(5);
		set.add(null);
		set.add(2);
		set.add(8);
		System.out.println(set);
		System.out.println(set);
		set.remove(5);
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(22);
		list.add(3);
		list.add(4);
		System.out.println("List: "+list);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		System.out.println("set1: "+set1);

	}

}
