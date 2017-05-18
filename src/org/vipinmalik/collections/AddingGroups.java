package org.vipinmalik.collections;

import java.util.*;

class AddingGroups {
	public static void main(String[] args) {
		// Collection class is used to create any kind of collection like ArrayList, Set, Map
		Collection<Integer> intCollection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

		System.out.println(intCollection.size());
		
		Integer[] moreInts = {5,6,7,8};

		// using addAll to add elements to ArrayList
		intCollection.addAll(Arrays.asList(moreInts));

		System.out.println(intCollection.size());

		// Collections class provide functions to operate on created collection
		// Collections.addAll runs faster
		Collections.addAll(intCollection, 9, 10, 11, 12);
		
		System.out.println(intCollection.size());
		
		// Use below methods as preference to create collections
		Collection<String> strCollection = new ArrayList<String>();
		
		Collections.addAll(strCollection, "Vipin", "Kumar", "Malik");
		
		System.out.println(strCollection.size());
	}
}