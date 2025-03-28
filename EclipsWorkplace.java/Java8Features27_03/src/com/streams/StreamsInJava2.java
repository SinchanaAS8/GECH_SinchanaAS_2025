package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sinchu","pri","Moksh","Hasini");
		List<String> new_list = list.stream().map((s)->s.toUpperCase()).collect(Collectors.toList());  //map is like a function
		System.out.println(new_list);


		List<String> new_list1 = list.stream().map((s)->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(new_list1);
	}

}
