package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {

	public static void main(String[] args) {
		/*
		 * Generics:
		 * =========
		 *    To provide the type safety and to avoid the type casting in collection then we should go for generic
		 */
		
		char [] arr = {'a', 'b','c','d'}; //type safety
		char firstEle = arr[0]; //without type casting(not required)
		System.out.println(firstEle);
		
		//without Generics
		List arr1 = new ArrayList(); // there is no type safty
		arr1.add(12);
		arr1.add(25.2);
		arr1.add("hello");
		int value = (int) arr1.get(0);
		System.out.println(value);
		
		//Generics
		List<Integer> list = new ArrayList<>(); //type safety
		list.add(12);
		list.add(125);
//		list.add(12.5); // it is not posible as we declare Integer type firstly
		int a = list.get(1);
		System.out.println(a);
		System.out.println(list);

	}

}
