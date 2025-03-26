package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInjava {

	public static void main(String[] args) {
		/*
		 * Map:
		 * ====
		 *   When you reoresent a group of individual object as a single entity in the form of key value pair 
		 *   then we should for map interface
		 *   
		 */
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Sinchana");
		map.put(2, "Priya");
		map.put(3, "Moksh");
		System.out.println(map);
		map.remove(1);
		System.out.println(map);
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Sinchana"));
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>((a,b)->b-a);
		treemap.put(4, "Shiva");
		treemap.put(5, "Shobha");
		System.out.println(treemap);
		treemap.put(6, "J");
		treemap.put(7, "v");
		System.out.println(treemap);
		treemap.remove(7);
		System.out.println(treemap);

	}

}
