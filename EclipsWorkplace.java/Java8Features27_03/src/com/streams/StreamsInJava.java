package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(1);
		// 1. need to filter based on the odd number
		Stream<Integer> stream = list.stream(); 
		List<Integer> num = stream.filter((i)->i%2!=0).collect(Collectors.toList());
		System.out.println(num);
		
		List<Integer> num1 = list.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println(num1);
		

	}

}
