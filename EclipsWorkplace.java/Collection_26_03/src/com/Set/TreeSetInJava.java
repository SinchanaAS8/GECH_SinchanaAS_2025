package com.Set;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>((a,b)->b-a);
		treeset.add(2);
		treeset.add(4);
		treeset.add(7);
		treeset.add(88);
		treeset.add(6);
		System.out.println(treeset);
		

	}

}
