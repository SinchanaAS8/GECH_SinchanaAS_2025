package com.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInJava {

	public static void main(String[] args) {
		/*
		 * Consumer:
		 * =========
		 *    It will consume the value but won't return anything
		 */
		Consumer<String> c = (s)-> System.out.println(s);
		c.accept("hello");

	}

}
