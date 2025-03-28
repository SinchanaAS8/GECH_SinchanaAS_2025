package com.predefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInJava {

	public static void main(String[] args) {
		/*
		 * Supplier:
		 * ========
		 *  It won't take anything but it will return the value
		 */
		Supplier<Date> s = ()->new Date();     // -> lamda expression datatype is function Interface
		Date date = s.get();
		System.out.println(date);

	}

}
