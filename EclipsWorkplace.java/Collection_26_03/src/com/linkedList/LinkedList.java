package com.linkedList;

import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		/*
		 * LinkedList:
		 * ==========
		 * * Linked list is a improved version of doubly linked list
		 * * Linked list underline data structure is Dynamic array --> we can insert and delete without giving size of an array
		 * * Linked list allow duplicate
		 * * LinkedList allow random access(using index)
		 * * LinkedList will allow null value
		 * * LinkedList will preserve the order of insertion
		 */
		List<Integer> list = new java.util.LinkedList<Integer>();
		list.add(1);
		list.add(55);
		list.add(6);
		System.out.println(list);
		System.out.println(list.get(2));
		
		/*
		 * linked list underline data structure is doubly linked list
		 * array list Dynamic Array
		 * 
		 * linked list will occupy more memory(3 nodes).
		 * array list will occupy less memory
		 * 
		 * when ever there is a continuous operation on deletion we should go for a linked list.
		 * when ever there is not  a continuous operation on deletion we should go for a linked list..
		 * 
		 * when ever there is a continuous operation on  insertion we can go for a linked list.
		 * when ever there is  not a continuous operation on  insertion we can go for a linked list.
		 * 
		 * for a easy memory access using index we should go for array list.
		 * for not  a easy memory access using index we should go for linked  list -because it makes use of pointers(It stores the addresss of a another variable).
		 * 
		 * integer takes a 4 bytes of memory for each block
		 * */

	}

}
