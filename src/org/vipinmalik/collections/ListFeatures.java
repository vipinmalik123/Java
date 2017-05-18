package org.vipinmalik.collections;

import java.util.*;

public class ListFeatures {
	public static void main (String[] Args) {
		List<String> pets = new ArrayList<String>();
		
		Collections.addAll(pets, "Dog", "Cat", "Cow");
		
		printList(pets);
		
		pets.add("Buffalo");
		
		printList(pets);
		
		System.out.println(pets.contains("Cat"));
		
		System.out.println(pets.get(0));
		
		System.out.println(pets.indexOf("Dog"));
		
		pets.addAll(Arrays.asList("Horse","Donkey"));
		
		printList(pets);
	}
	
	public static void printList (List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			String item = it.next();
			System.out.print(item + " ");
		}
		System.out.println("");
	}
}
