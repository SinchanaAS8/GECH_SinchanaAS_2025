package com.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		/*
		 * Function:
		 * =========
		 *    It will take one parameter then perform action and return the value
		 */

		Function<String, Integer> f = (s)->s.length();
		int res = f.apply(" Priya A S ");
		System.out.println(res);
		
		Function<Integer, Integer> f1 = (s)->s*s;
		int res1 = f1.apply(4);
		System.out.println(res1);
		
	}

}
