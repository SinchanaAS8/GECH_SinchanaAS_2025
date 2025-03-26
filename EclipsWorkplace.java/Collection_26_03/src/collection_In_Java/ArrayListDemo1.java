package collection_In_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(3);
		
		//1. for loop
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//2. for each
		for(int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//3. forEach
		list.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//4. iterator
		Iterator<Integer> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
